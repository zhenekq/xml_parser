package by.epamtc.xml.validator.service.command.action;

import by.epamtc.xml.validator.service.command.Command;
import by.epamtc.xml.validator.service.dao.file.FactoryFileDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAO;
import by.epamtc.xml.validator.util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@MultipartConfig
public class DOMValidationCommand implements Command {

    private static FactoryFileDAO factoryFileDAO = FactoryFileDAO.getInstance();
    private static FileDAO fileDAOImpl = factoryFileDAO.getFileDAOImpl();
    private final static Logger LOGGER =
            Logger.getLogger(DOMValidationCommand.class.getCanonicalName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (Util.initialService(request, response)) {
            System.out.println("vads");
        }
    }

}
