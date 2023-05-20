package design_pattern.adapter;

import design_pattern.adapter.adapter.WAVAdapter;
import design_pattern.adapter.player.MP3Player;
import design_pattern.adapter.player.Player;

public class Client {

    private static void playSong(String song){
        Player player = null;
        if(song.endsWith(".mp3")){
            player = new MP3Player();
        }
        else if (song.endsWith(".wav")){
            player = new WAVAdapter();
        }
        if(player != null){
            player.play(song);
        }
        else{
            System.out.println("Không hỗ trợ định dạng này≠");
        }
    }
    public static void main(String[] args) {
        
        String song2 = "song2.wav";
        String song3 = "song3.mp4";

        playSong(song2);
        playSong(song3);

    }
}
