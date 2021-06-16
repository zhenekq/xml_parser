package by.epamtc.xml.validator.service.dao.file;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;

public interface FileDAO {
    String getFileName(final Part part);
    InputStream getFile(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
