package com.example.messagesenders;

import com.example.bots.HelloBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class MessageSenderImpl implements MessageSender {
    private HelloBot helloWorldBot;

    @Override
    public void sendMessage(SendMessage sendMessage) {
        try {
            helloWorldBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    public void setHelloWorldBot(@Lazy HelloBot helloWorldBot) {
        this.helloWorldBot = helloWorldBot;
    }

    @Override
    public void sendEditMessage(EditMessageText editMessageText) {
        try {
            helloWorldBot.execute(editMessageText);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
