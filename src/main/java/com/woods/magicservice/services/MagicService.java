package com.woods.magicservice.services;

import com.woods.magicservice.client.ScryfallClient;
import com.woods.magicservice.entities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class MagicService {

    @Autowired
    ScryfallClient scryfallClient;

    public Card getRandomCard() {

        Map<String, Object> jsonResponse = scryfallClient.randomCard();

        return bindToEntity(jsonResponse);
    }

    private Card bindToEntity(Map<String, Object> jsonResponse) {

        return new Card(jsonResponse.get("id").toString(),
                jsonResponse.get("name").toString(),
                jsonResponse.get("released_at").toString(),
                jsonResponse.get("image_uris").toString(),
                jsonResponse.get("mana_cost").toString(),
                jsonResponse.get("type_line").toString(),
                jsonResponse.get("oracle_text").toString(),
                Objects.nonNull(jsonResponse.get("power")) ? jsonResponse.get("power").toString() : "",
                Objects.nonNull(jsonResponse.get("toughness")) ? jsonResponse.get("toughness").toString() : "",
                jsonResponse.get("colors").toString(),
                jsonResponse.get("rarity").toString(),
                jsonResponse.get("artist").toString());
    }
}
