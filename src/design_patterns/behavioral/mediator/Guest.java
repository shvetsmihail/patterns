package design_patterns.behavioral.mediator;

public class Guest implements User {
    private final Chat chat;
    public final String name;

    public Guest(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
        chat.addUser(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        chat.send(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Guest " + name + " received message: " + message);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                '}';
    }
}
