package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
@ComponentScan("com.example")
public class SofaBotApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(SofaBotApplication.class, args);

		//HelloBot telegramBot = new HelloBot();
		//TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
		//telegramBotsApi.registerBot(telegramBot);
	}

}
