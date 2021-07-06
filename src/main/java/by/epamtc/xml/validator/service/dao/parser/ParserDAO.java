package by.epamtc.xml.validator.service.dao.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;

public interface ParserDAO {
    void parseFile(InputStream inputStream) throws ParserConfigurationException, SAXException;
}
