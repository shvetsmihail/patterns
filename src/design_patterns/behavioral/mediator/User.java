package design_patterns.behavioral.mediator;

public interface User {
    String getName();

    void sendMessage(String message);

    void receiveMessage(String message);
}
