package com.example.handlers;

import com.example.messagesenders.MessageSender;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class MessageHandler implements Handler<Message> {

    private MessageSender messageSender;
    //❤️😁😌🎃

    private List<String> compliments = Arrays.asList(
            "Как только встретимся, первым делом пойдем мне за очками. А то с таким солнышком как ты, мне они " +
                    "понадабятся даже в пасмурную погоду❤))",
            "\uD83D\uDE0C❤️ Красивее тебя могут быть лишь твои нежно голубые оченятка, взгляд которых заставляет" +
                    " влюбляются меня все сильнее и сильнее с каждым взглядом \uD83D\uDC99 "
    );
    @Override
    public void choose(Message message) {



//        if(message.hasText()){
//
//            String command = message.getText();
//            SendMessage sendMessage = new SendMessage();
//            sendMessage.setChatId(message.getChatId());
//
//            switch (command){
//                case "/get_compliment" : {
//                    String compliment = compliments.get((int)(Math.random()*(compliments.size()-1)));
//                    sendMessage.setText(compliment);
//                }
//            }
////            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
////            List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
////            keyboard.add(
////                    Collections.singletonList(
////                            InlineKeyboardButton.builder()
////                                    .text("Новий вірш")
////                                    .callbackData("next_poem")
////                                    .build()));
////            inlineKeyboardMarkup.setKeyboard(keyboard);
////            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
//            messageSender.sendMessage(sendMessage);
//        }
    }
}
