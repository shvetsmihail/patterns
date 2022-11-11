package design_patterns.behavioral.stategy;

public class Musician {
    private MusicStyle musicStyle;

    public Musician(MusicStyle musicStyle) {
        this.musicStyle = musicStyle;
    }

    public void setMusicStyle(MusicStyle musicStyle) {
        this.musicStyle = musicStyle;
    }

    public void play() {
        musicStyle.playMusic();
    }
}
