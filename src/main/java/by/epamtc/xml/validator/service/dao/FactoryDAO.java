package by.epamtc.xml.validator.service.dao;

import by.epamtc.xml.validator.service.dao.file.FileDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAOImpl;

public final class FactoryDAO {
    private static final FactoryDAO instance = new FactoryDAO();

    private final FileDAO fileDAOImpl = new FileDAOImpl();

    public static FactoryDAO getInstance() {
        return instance;
    }

    public FileDAO getFileDAOImpl() {
        return fileDAOImpl;
    }
}
