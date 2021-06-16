package by.epamtc.xml.validator.service.command.action;

import by.epamtc.xml.validator.service.command.Command;
import by.epamtc.xml.validator.service.dao.FactoryDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAOImpl;
import by.epamtc.xml.validator.util.Util;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.util.logging.Logger;

@MultipartConfig
public class DOMValidationCommand implements Command {

    private static FactoryDAO factoryDAO = FactoryDAO.getInstance();
    private static FileDAO fileDAOImpl = factoryDAO.getFileDAOImpl();
    private final static Logger LOGGER =
            Logger.getLogger(DOMValidationCommand.class.getCanonicalName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        /*response.setContentType("text/html;charset=UTF-8");
        Part file = request.getPart("file");
        String fileName = fileDAOImpl.getFileName(file);
        boolean isCorrect = false;
        if (Util.isCorrectData(fileName)) {
            isCorrect = true;
            request.setAttribute("parsed_file",fileName);
            request.setAttribute("parsing_tool", request.getParameter("selected_items"));
            fileDAOImpl.getFile(request,response);
        } else {
            request.setAttribute("isVisible", isCorrect);
            //System.out.println(request.getAttribute("isVisible"));
        }*/
        if(Util.initialService(request,response)){

        }

    }

}
