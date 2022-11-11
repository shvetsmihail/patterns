package design_patterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Movie movie = new ProxyAvengers();

        movie.play();
        movie.play();
    }
}
