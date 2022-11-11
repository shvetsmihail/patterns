package design_patterns.structural.proxy;

public class Avengers implements Movie {
    public Avengers() {
        loadMovie();
    }

    private void loadMovie() {
        System.out.println("Loading Avengers ...");
    }

    @Override
    public void play() {
        System.out.println("Play Avengers ...");
    }
}
