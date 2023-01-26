package com.woods.magicservice.controllers;

import com.woods.magicservice.entities.Card;
import com.woods.magicservice.services.MagicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/v1/magic")
@RestController
public class MagicController {

    @Autowired
    MagicService magicService;

    @GetMapping
    ResponseEntity<Card> allCards(){

        Card card = magicService.getRandomCard();

        return ResponseEntity.ok(card);
    }
}
