package design_pattern.adapter.player;

public interface Player {
    void play(String fileName);
    boolean isPlaying();
    String getFileInfo();
}
