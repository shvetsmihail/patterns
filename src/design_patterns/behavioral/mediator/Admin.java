package design_patterns.behavioral.mediator;

public class Admin implements User {
    private final Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
        chat.setAdmin(this);
    }

    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public void sendMessage(String message) {
        chat.send(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Admin received message: " + message);
    }

    public void sayHello(User user) {
        sendMessage("Hi " + user.getName());
    }
}
