package com.woods.magicservice.services;

import com.woods.magicservice.client.ScryfallClient;
import com.woods.magicservice.entities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagicService {

    @Autowired
    ScryfallClient scryfallClient;

    public Card getRandomCard() {

        return scryfallClient.randomCard();
    }
}
