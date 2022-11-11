package design_patterns.behavioral.command;

public class TurnOffTV implements Command {
    private final TV tv;

    public TurnOffTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
