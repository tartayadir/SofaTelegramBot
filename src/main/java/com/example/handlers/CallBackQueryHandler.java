package com.example.handlers;

import com.example.answerelements.Compliments;
import com.example.messagesenders.MessageSender;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
                System.out.println("Song");
                break;
            case "Photo" :
                System.out.println("Photo");
                break;
            case "Compliment" :
                System.out.println("Compliment");
                break;
        }
    }
}
