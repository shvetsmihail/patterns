package design_patterns.behavioral.stategy;

public class ClassicMusic implements MusicStyle{

    @Override
    public void playMusic() {
        System.out.println("Play classicMusic");
    }
}
