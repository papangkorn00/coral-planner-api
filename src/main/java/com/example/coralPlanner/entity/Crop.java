package com.example.coralPlanner.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
@Table(name = "crops")
@Data
public class Crop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(columnDefinition = "text[]")
    private List<String> seasons;

    @Column(name = "town_rank")
    private String townRank;

    @Column(name = "growth_time_day")
    private Integer growthTimeDay;

    @Column(name = "re_growth_time_day")
    private Integer regrowthTimeDay;

    @Column(name = "possible_max_harvest_day")
    private Integer possibleMaxHarvestDay;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "seed_price")
    private Integer seedPrice;

    @Column(name = "price_base")
    private Integer sellPriceBase;

    @Column(name = "price_bronze")
    private Integer sellPriceBronze;

    @Column(name = "price_silver")
    private Integer sellPriceSilver;

    @Column(name = "price_gold")
    private Integer sellPriceGold;

    @Column(name = "price_osmium")
    private Integer sellPriceOsmium;

}
