package by.epamtc.xml.validator.service.command.action;

import by.epamtc.xml.validator.service.command.Command;
import by.epamtc.xml.validator.service.dao.file.FactoryFileDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAO;
import by.epamtc.xml.validator.service.dao.parser.FactoryParserDAO;
import by.epamtc.xml.validator.service.dao.parser.xml_parser.SAXParserDAOImpl;
import by.epamtc.xml.validator.util.Util;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAXValidatorCommand implements Command {

    private static FactoryFileDAO factory = FactoryFileDAO.getInstance();
    private static FileDAO fileDAO = factory.getFileDAOImpl();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("SAX VALIDATOR RAN");
        if (Util.initialService(request, response)) {
            //fileDAOImpl.getFile(request,response);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            try {
                SAXParser parser = factory.newSAXParser();
                XMLReader reader = parser.getXMLReader();
                reader.setContentHandler(new SAXParserDAOImpl());
                reader.parse("tariffs.xml");
            } catch (ParserConfigurationException | SAXException e) {
                e.printStackTrace();
            }

        }
    }

}
