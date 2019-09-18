package com.zikozee.springboot.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckServiceImpl implements ChuckService{
//    private ChuckNorrisQuotes chuckNorrisQuotes;
//
//    public ChuckServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
//        this.chuckNorrisQuotes = chuckNorrisQuotes;
//    }

    @Override
    public String getRandomQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
