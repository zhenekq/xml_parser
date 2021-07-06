package by.epamtc.xml.validator.util;

import by.epamtc.xml.validator.service.dao.file.FactoryFileDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAO;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class Util {

    private static FactoryFileDAO factoryFileDAO = FactoryFileDAO.getInstance();
    private static FileDAO fileDAOImpl = factoryFileDAO.getFileDAOImpl();

    public static boolean isCorrectData(String data) {
        if (data == null)
            return false;
        return !data.equals("") && !data.isEmpty();
    }

    public static boolean initialService(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        Part file = request.getPart("file");
        String fileName = fileDAOImpl.getFileName(file);
        boolean isCorrect = false;
        if (Util.isCorrectData(fileName)) {
            isCorrect = true;
            request.setAttribute("parsed_file", fileName);
            request.setAttribute("parsing_tool", request.getParameter("selected_items"));
            fileDAOImpl.getFile(request, response);
            return isCorrect;
        } else {
            request.setAttribute("isVisible", isCorrect);
            //System.out.println(request.getAttribute("isVisible"));
        }
        return isCorrect;
    }

    public static boolean isValidaXMLDocument(String fileName, String fileValidation) {
        String language = XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);

        boolean isValid = true;

        File schemaLocation = new File(fileName);

        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);
        } catch (SAXException | IOException e) {
            isValid = false;
            System.out.println(fileName + "is not correct!");
        }


        return isValid;
    }

}
