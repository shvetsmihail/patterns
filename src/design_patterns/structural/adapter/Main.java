package design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        EUSocket euSocket = new EuUsaSocketAdapter();
        euSocket.plugEUSocket();
    }
}
