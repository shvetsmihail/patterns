package design_patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<String, Command> commands;

    public RemoteControl(TV tv) {
        this.commands = new HashMap<>();
        commands.put("on", new TurnOnTV(tv));
        commands.put("off", new TurnOffTV(tv));
    }

    public void pressButton(String name) {
        Command command = commands.get(name);
        if (command != null) {
            command.execute();
        }
    }

}
