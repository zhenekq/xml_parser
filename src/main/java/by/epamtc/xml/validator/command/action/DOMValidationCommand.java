package by.epamtc.xml.validator.command.action;

import by.epamtc.xml.validator.command.Command;
import by.epamtc.xml.validator.util.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DOMValidationCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String file = request.getParameter("file");
        boolean isCorrect = false;
        if(Util.isCorrectData(file)){
            isCorrect = true;
        }else{
            request.setAttribute("isVisible", isCorrect);
            //System.out.println(request.getAttribute("isVisible"));
            return;
        }

        System.out.println("DOM VALUE");
    }
}
