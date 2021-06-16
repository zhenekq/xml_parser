package by.epamtc.xml.validator.service.command;

import by.epamtc.xml.validator.service.command.action.DOMValidationCommand;
import by.epamtc.xml.validator.service.command.action.SAXValidatorCommand;
import by.epamtc.xml.validator.service.command.action.StAXValidatorCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private static CommandProvider instance = new CommandProvider();

    private Map<CommandName, Command> commands = new HashMap<>();

    private CommandProvider() {
        commands.put(CommandName.DOM,
                new DOMValidationCommand());

        commands.put(CommandName.SAX,
                new SAXValidatorCommand());

        commands.put(CommandName.STAX,
                new StAXValidatorCommand());
    }

    public static CommandProvider getInstance() {
        return instance;
    }

    public Command getCommand(String commandName) {
        CommandName name = CommandName.valueOf(commandName.toUpperCase());
        Command command;
        if (name != null) {
            command = commands.get(name);
        } else {
            command = commands.get(CommandName.ERROR_PARSER);
        }
        return command;
    }
}
