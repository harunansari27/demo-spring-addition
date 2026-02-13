package com.mycomp.demoapp.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
    public class AppConfig {
      @Bean
         Random random() {
           log.info("Creating Random bean");
           return new Random();
     }


     @Bean
      Gson gson(GsonBuilder gsonBuilder) {
         log.info("Creating Gson bean");
         return gsonBuilder.create();
     }
}
