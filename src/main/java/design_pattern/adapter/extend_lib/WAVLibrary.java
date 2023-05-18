package design_pattern.adapter.extend_lib;

import java.io.File;

public class WAVLibrary {
    private String pathFile;
    private int playing = 0;

    public WAVLibrary(){}

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public void playAudio() throws RuntimeException{
        if(pathFile == null || pathFile.isEmpty()){
            throw new RuntimeException("File path is empty");
        }
        System.out.println("Playing WAV file: " + pathFile);
        playing = 1;
    }
    public int isPlay(){
        return playing;
    }

}
