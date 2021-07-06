package by.epamtc.xml.validator.service.dao.parser;

import by.epamtc.xml.validator.service.dao.file.FileDAO;
import by.epamtc.xml.validator.service.dao.parser.xml_parser.DOMParserDAOImpl;
import by.epamtc.xml.validator.service.dao.parser.xml_parser.SAXParserDAOImpl;
import by.epamtc.xml.validator.service.dao.parser.xml_parser.StAXParserDAOImpl;

public class FactoryParserDAO {
    private static final FactoryParserDAO instance = new FactoryParserDAO();

    private final ParserDAO domParserDAO = new DOMParserDAOImpl();
    private final ParserDAO saxParserDAO = new SAXParserDAOImpl();
    private final ParserDAO stAXParserDAO = new StAXParserDAOImpl();

    public static FactoryParserDAO getInstance() {
        return instance;
    }

    public ParserDAO getDomParserDAO() {
        return domParserDAO;
    }

    public ParserDAO getSaxParserDAO() {
        return saxParserDAO;
    }

    public ParserDAO getStAXParserDAO() {
        return stAXParserDAO;
    }
}
