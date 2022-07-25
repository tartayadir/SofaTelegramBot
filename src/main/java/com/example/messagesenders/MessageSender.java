package com.example.messagesenders;

import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

public interface MessageSender {

    void sendAudio(SendAudio sendAudio);

    void sendMessage(SendMessage sendMessage);

    void sendPhoto(SendPhoto sendPhoto);
}
