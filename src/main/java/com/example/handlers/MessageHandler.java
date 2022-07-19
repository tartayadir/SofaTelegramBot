package com.example.handlers;

import com.example.answerelements.Compliments;
import com.example.answerelements.WelcomePhrases;
import com.example.messagesenders.MessageSender;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MessageHandler implements Handler<Message> {

    private final MessageSender messageSender;
    //❤️😁😌🎃

    public MessageHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    @SneakyThrows
    public void choose(Message message) {

        if (message.hasText() && message.hasEntities()) {
            Optional<MessageEntity> commandEntity =
                    message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();
            if (commandEntity.isPresent()) {
                String command =
                        message
                                .getText()
                                .substring(commandEntity.get().getOffset(), commandEntity.get().getLength());
                SendMessage sendMessage;

                switch (command) {
                    case "/start": {

                        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
                        buttons.add(
                                Arrays.asList(
                                        InlineKeyboardButton.builder()
                                                .text("Случайная песня")
                                                .callbackData("Song" )
                                                .build(),
                                        InlineKeyboardButton.builder()
                                                .text("Случайное фото")
                                                .callbackData("Photo" )
                                                .build(),
                                        InlineKeyboardButton.builder()
                                                .text("Комплимент")
                                                .callbackData("Compliment" )
                                                .build()));
                        String welcomePhrases = WelcomePhrases.randomWelcomePhrases();
                        sendMessage = SendMessage.
                                builder().
                                text(welcomePhrases).
                                chatId(message.getChatId()).
                                replyMarkup(InlineKeyboardMarkup.builder().keyboard(buttons).build()).
                                build();
                        messageSender.sendMessage(sendMessage);
                    }
                }
            }
        }
    }
}
