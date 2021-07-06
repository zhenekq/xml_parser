package by.epamtc.xml.validator.service.dao.parser.xml_parser;

import by.epamtc.xml.validator.service.dao.parser.ParserDAO;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;

public class SAXParserDAOImpl extends DefaultHandler implements ParserDAO {
    @Override
    public void parseFile(InputStream inputStream) throws ParserConfigurationException, SAXException {

    }

}
