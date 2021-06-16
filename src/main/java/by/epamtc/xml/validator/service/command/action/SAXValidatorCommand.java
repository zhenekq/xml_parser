package by.epamtc.xml.validator.service.command.action;

import by.epamtc.xml.validator.service.command.Command;
import by.epamtc.xml.validator.util.Util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SAXValidatorCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("SAX VALIDATOR RAN");
        Util.initialService(request,response);
    }
}
