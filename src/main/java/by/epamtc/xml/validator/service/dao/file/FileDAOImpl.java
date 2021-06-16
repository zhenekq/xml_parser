package by.epamtc.xml.validator.service.dao.file;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDAOImpl implements FileDAO {

    private final static Logger LOGGER =
            Logger.getLogger(FileDAOImpl.class.getCanonicalName());

    @Override
    public InputStream getFile(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getParameter("destination");
        Part filePart = request.getPart("file");
        String fileName = getFileName(filePart);

        InputStream fileContent = null;

        try {
            fileContent = filePart.getInputStream();
            //print(fileContent);
            String value = print(fileContent);
            request.setAttribute("parsed_info",value);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return fileContent;
    }


    @Override
    public String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    private static String print(InputStream stream) throws IOException {
        int i;
        StringBuilder values = new StringBuilder();
        while ((i = stream.read()) != -1) {
            values.append((char) i);
            //System.out.print((char) i);
        }
        //System.out.println(values);
        return values.toString();
    }

}
