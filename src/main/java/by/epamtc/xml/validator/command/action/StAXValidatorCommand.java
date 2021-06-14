package by.epamtc.xml.validator.command.action;

import by.epamtc.xml.validator.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StAXValidatorCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("STAX VALIDATOR RAN");
    }
}
