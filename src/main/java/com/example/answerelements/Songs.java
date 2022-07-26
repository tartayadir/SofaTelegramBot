package com.example.answerelements;

import org.springframework.util.ResourceUtils;
import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Songs {

    private static final List<String> pathToSongs = Arrays.asList(
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/rjiLgGENnhw1nXep.mp3",
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/F2TA7ViEs3L1eN9i.mp3",
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/Edward Sharpe amp The Magnetic Zeros-Home.mp3",
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/Dermot Kennedy-Power Over Me.mp3",
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/68387754.mp3",
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/17955170.mp3",
            "C:/Tomcats/SofaBot/demo/src/main/resources/songs/2step.mp3"
    );

    public static InputFile randomSong(){

        InputFile inputFile = new InputFile();

        try {
            File song = ResourceUtils.getFile(pathToSongs.get((int) (Math.random() * (pathToSongs.size()))));
            inputFile = new InputFile(song);

        }catch (IOException ioException){
            ioException.printStackTrace();
        }

        return inputFile;
    }
}
