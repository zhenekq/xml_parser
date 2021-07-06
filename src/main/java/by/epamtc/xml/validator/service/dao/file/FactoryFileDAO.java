package by.epamtc.xml.validator.service.dao.file;

public final class FactoryFileDAO {
    private static final FactoryFileDAO instance = new FactoryFileDAO();

    private final FileDAO fileDAOImpl = new FileDAOImpl();

    public static FactoryFileDAO getInstance() {
        return instance;
    }

    public FileDAO getFileDAOImpl() {
        return fileDAOImpl;
    }
}
