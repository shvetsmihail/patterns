package design_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat {

    private final List<User> users = new ArrayList<>();
    public Admin admin;

    @Override
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        if (admin != null) {
            admin.sayHello(user);
        }
    }

    @Override
    public void send(String message, User sender) {
        String fullMessage = sender.getName() + ": " + message;
        users.stream()
                .filter(user -> user != sender)
                .forEach(user -> user.receiveMessage(fullMessage));

        admin.receiveMessage(fullMessage);

    }
}
