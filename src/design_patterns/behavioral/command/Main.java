package design_patterns.behavioral.command;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new TV());

        remoteControl.pressButton("on");
        remoteControl.pressButton("off");
    }
}
