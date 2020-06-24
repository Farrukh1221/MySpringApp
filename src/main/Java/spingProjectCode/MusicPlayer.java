package spingProjectCode;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music musicList;
    private String name;
    private int volume;

    public MusicPlayer(Music music){
        this.musicList  = music;
    }

    public MusicPlayer(){}

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println("Playing: " + musicList.getSong() + " "  +
                                         musicList.WhySingSong() + " " +
                                         musicList.WhereWillBeConsert() + " " +
                                         musicList.HowManyHoursTheConsert() + " " +
                                         musicList.HowManyPaper());
    }

    public void setMusic(Music music){
        this.musicList = music;
    }

    public void setMusicList(ClassicalMusic musicList) {
        this.musicList = musicList;
    }
}
