package by.epamtc.xml.validator.util;

import by.epamtc.xml.validator.service.dao.FactoryDAO;
import by.epamtc.xml.validator.service.dao.file.FileDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

public class Util {

    private static FactoryDAO factoryDAO = FactoryDAO.getInstance();
    private static FileDAO fileDAOImpl = factoryDAO.getFileDAOImpl();

    public static boolean isCorrectData(String data){
        if(data == null)
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
            request.setAttribute("parsed_file",fileName);
            request.setAttribute("parsing_tool", request.getParameter("selected_items"));
            return isCorrect;
        } else {
            request.setAttribute("isVisible", isCorrect);
            //System.out.println(request.getAttribute("isVisible"));
        }
        return isCorrect;
    }

}
