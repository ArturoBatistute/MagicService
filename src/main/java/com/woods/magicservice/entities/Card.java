package com.woods.magicservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Card {

    private String id;

    private String name;

    @JsonProperty("released_at")
    private String releasedAt;

    @JsonProperty("image_uris")
    private Map<String,String> imageUrls;

    @JsonProperty("mana_cost")
    private String manaCost;

    private String[] keywords;

    @JsonProperty("oracle_text")
    private String description;

    private String power;

    private String toughness;

    private String[] colors;

    private String rarity;

    private String artist;
}
