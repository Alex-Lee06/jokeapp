package com.springframework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

//This is used to make a service
@Service
public class JokeServiceImpl implements JokeService{

    //created an immutable variable
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //Constructor for final variable
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
