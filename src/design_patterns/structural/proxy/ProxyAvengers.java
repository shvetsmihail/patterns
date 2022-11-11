package design_patterns.structural.proxy;

public class ProxyAvengers implements Movie {
    private Avengers avengers;

    @Override
    public void play() {
        if (avengers == null) {
            avengers = new Avengers();
        }
        avengers.play();
    }
}
