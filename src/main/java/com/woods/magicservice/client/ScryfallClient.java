package com.woods.magicservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "scryfall-client", url = "https://api.scryfall.com")
public interface ScryfallClient {

    @GetMapping(value = "/cards/random", consumes = MediaType.APPLICATION_JSON_VALUE)
    Map<String, Object> randomCard();
}
