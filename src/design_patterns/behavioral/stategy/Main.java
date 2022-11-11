package design_patterns.behavioral.stategy;

public class Main {
    public static void main(String[] args) {
        Musician musician = new Musician(new RockMusic());
        musician.play();

        musician.setMusicStyle(new ClassicMusic());
        musician.play();
    }
}
