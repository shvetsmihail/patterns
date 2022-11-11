package design_patterns.behavioral.command;

public class TurnOnTV implements Command{
    private final TV tv;

    public TurnOnTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
