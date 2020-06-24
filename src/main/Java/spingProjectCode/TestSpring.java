package spingProjectCode;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName() + " " + testBean.getAge() + "\n");

        // Music music = context.getBean("musicBean",Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("musicBean1",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
