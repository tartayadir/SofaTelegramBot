package com.example.processors;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public interface Processor {

    void executeMessage(Message message);

    void executeCallBackQuery(CallbackQuery callbackQuery);

    default void process(Update update){
        if (update.hasMessage()){
            executeMessage(update.getMessage());
        }else if (update.hasCallbackQuery()){
            executeCallBackQuery(update.getCallbackQuery());
        }
    }
}
