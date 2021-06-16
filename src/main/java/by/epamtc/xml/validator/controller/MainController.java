package by.epamtc.xml.validator.controller;

import by.epamtc.xml.validator.service.command.Command;
import by.epamtc.xml.validator.service.command.CommandProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MultipartConfig
public class MainController extends HttpServlet {

    private static final CommandProvider provider = CommandProvider.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandName;
        Command command;
        commandName = request.getParameter("selected_items");
        command = provider.getCommand(commandName);
        command.execute(request, response);
        doGet(request,response);
    }
}
