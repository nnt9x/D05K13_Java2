package design_pattern.adapter.player;

public class MP3Player implements Player{
    private String file;
    private boolean playing = false;

    public MP3Player(){}

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public void play(String fileName) {
        setFile(fileName);
        System.out.println("Playing MP3 file: " + fileName);
        playing = true;
    }
    public void play(){
        System.out.println("Playing MP3 file: " + file);
        playing = true;
    }

    @Override
    public boolean isPlaying() {
        return playing;
    }

    @Override
    public String getFileInfo() {
        return "File ino: " + file + ", format: MP3";
    }
}
