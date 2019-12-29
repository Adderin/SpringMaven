package ru.adel.springmaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(music2);

        musicPlayer1.playMusic();

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean compare = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(compare);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
