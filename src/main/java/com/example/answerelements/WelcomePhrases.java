package com.example.answerelements;

import java.util.Arrays;
import java.util.List;

public class WelcomePhrases implements AnswerElements{

    private static final List<String> phrases = Arrays.asList(
            "Привет золотко, я твой бот \uD83D\uDD90\uD83C\uDFFB. Я создан чтобы поднимать настроение своей " +
                    "маленькой депресивной принцесе.\uD83E\uDD17❤"
    );

    public static String randomWelcomePhrases(){
        return phrases.get((int) (Math.random() * (phrases.size())));
    }
}
