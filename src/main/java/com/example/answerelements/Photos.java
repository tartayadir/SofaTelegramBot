package com.example.answerelements;

import org.springframework.util.ResourceUtils;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Photos implements AnswerElements{

    private static final List<String> pathsToPhotos = Arrays.asList(
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo11.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-19-37.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-19-44.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-19-48.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-19-51.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-19-58.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-20-02.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-20-30.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-20-37.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-20-42.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-20-52.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo_2022-07-20_13-20-59.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo24р.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo51р.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo112р.jpg",
            "C:/Tomcats/SofaBot/demo/src/main/resources/images/photo135р.jpg"


    );

    public static InputFile randomPhoto(){

        File photo;
        InputFile inputFile = new InputFile();

        try {
             photo = ResourceUtils.getFile(pathsToPhotos.get((int) (Math.random() * (pathsToPhotos.size()))));
             inputFile = new InputFile(photo);

        }catch (IOException ioException){
            ioException.printStackTrace();
        }

        return inputFile;
    }
}
