package com.zikozee.springboot.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Using Java Configuration
 * We are bringing in here and external dependency
 */
//@Configuration
public class ChuckConfiguration {
//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
