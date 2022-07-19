package com.example.answerelements;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Compliments {

    private static final List<String> compliments = Arrays.asList(
            "Как только встретимся, первым делом пойдем мне за очками. А то с таким солнышком как ты, мне они " +
                    "понадабятся даже в пасмурную погоду❤))",
            "\uD83D\uDE0C❤️ Красивее тебя могут быть лишь твои нежно голубые оченятка, взгляд которых заставляет" +
                    " влюбляются меня все сильнее и сильнее с каждым взглядом \uD83D\uDC99 "
    );

    public static String randomCompliment(){
        return compliments.get((int) (Math.random() * (compliments.size() )));
    }
}
