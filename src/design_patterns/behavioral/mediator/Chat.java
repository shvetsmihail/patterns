package design_patterns.behavioral.mediator;

public interface Chat {
    void setAdmin(Admin admin);
    void addUser(User user);
    void send(String message, User sender);

}

