package design_patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Chat chat = new SimpleChat();
        User admin = new Admin(chat);
        User user1 = new Guest(chat, "Mike");
        user1.sendMessage("hello");


        User user2 = new Guest(chat, "Rob");
        user2.sendMessage("hi");

        admin.sendMessage("dont be rude");

    }
}
