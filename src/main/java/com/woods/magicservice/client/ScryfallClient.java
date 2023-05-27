package com.woods.magicservice.client;

import com.woods.magicservice.entities.Card;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "scryfall-client", url = "https://api.scryfall.com")
public interface ScryfallClient {

    @GetMapping(value = "/cards/random", consumes = MediaType.APPLICATION_JSON_VALUE)
    Card randomCard();
}
