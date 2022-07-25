package com.example.handlers;

import com.example.answerelements.Compliments;
import com.example.answerelements.Photos;
import com.example.answerelements.Songs;
import com.example.messagesenders.MessageSender;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@Component
public class CallBackQueryHandler implements Handler<CallbackQuery>{


    private final MessageSender messageSender;

    public CallBackQueryHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void choose(CallbackQuery callbackQuery) {

        switch (callbackQuery.getData()){
            case "Song" :

                SendAudio sendAudio = SendAudio.
                        builder().
                        audio(Songs.randomSong()).
                        chatId(String.valueOf(callbackQuery.getMessage().getChatId())).
                        replyMarkup(InlineKeyboardMarkup.builder().keyboard(MessageHandler.buttons).build()).
                        build();

                System.out.println(sendAudio);
                messageSender.sendAudio(sendAudio);
                break;
            case "Photo" :{

                SendPhoto sendPhoto = SendPhoto.
                        builder().allowSendingWithoutReply(true).
                        replyToMessageId(callbackQuery.getMessage().getMessageId()).
                        caption("").
                        photo(Photos.randomPhoto()).
                        chatId(String.valueOf(callbackQuery.getMessage().getChatId())).
                        replyMarkup(InlineKeyboardMarkup.builder().keyboard(MessageHandler.buttons).build()).
                        build();

                System.out.println(sendPhoto);
                messageSender.sendPhoto(sendPhoto);
                break;
            }
            case "Compliment" :{
                String compliment = Compliments.randomCompliment();
                SendMessage sendMessage = SendMessage.
                        builder().
                        text(compliment).
                        chatId(String.valueOf(callbackQuery.getMessage().getChatId())).
                        replyMarkup(InlineKeyboardMarkup.builder().keyboard(MessageHandler.buttons).build()).
                        build();
                System.out.println(sendMessage);
                messageSender.sendMessage(sendMessage);
                break;
            }
        }
    }
}
