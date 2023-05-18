package design_pattern.adapter.adapter;

import design_pattern.adapter.extend_lib.WAVLibrary;
import design_pattern.adapter.player.Player;

public class WAVAdapter implements Player {

    private WAVLibrary wavPlayer;

    public WAVAdapter() {
        this.wavPlayer = new WAVLibrary();
    }

    @Override
    public void play(String fileName) {
        System.out.println("Play bởi bộ chuyển đổi Adapter");
        wavPlayer.setPathFile(fileName);
        wavPlayer.playAudio();
    }

    @Override
    public boolean isPlaying() {
        boolean isPlaying;
        if (wavPlayer.isPlay() == 1){
            isPlaying = true;
        }
        else{
            isPlaying = false;
        }
        return isPlaying;
    }

    @Override
    public String getFileInfo() {
        return "File info: " + wavPlayer.getPathFile() + ",format: WAV";
    }
}
