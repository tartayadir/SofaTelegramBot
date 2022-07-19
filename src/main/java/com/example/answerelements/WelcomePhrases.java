package com.example.answerelements;

import java.util.Arrays;
import java.util.List;

public class WelcomePhrases implements AnswerElements{

    private static final List<String> phrases = Arrays.asList(
            "Привет золотко",
            "\uD83D\uDE0C❤️ Красивее тебя могут быть лишь твои нежно голубые оченятка, взгляд которых заставляет" +
                    " влюбляются меня все сильнее и сильнее с каждым взглядом \uD83D\uDC99 "
    );

    public static String randomWelcomePhrases(){
        return phrases.get((int) (Math.random() * (phrases.size() )));
    }
}
