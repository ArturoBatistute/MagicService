package com.woods.magicservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Card {

    private String id;
    private String name;
    private String releasedAt;
    private String imageUrls;
    private String manaCost;
    private String type;
    private String description;
    private String power;
    private String toughness;
    private String colors;
    private String rarity;
    private String artist;
}
