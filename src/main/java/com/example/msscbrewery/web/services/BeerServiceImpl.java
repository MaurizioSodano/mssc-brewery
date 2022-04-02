package com.example.msscbrewery.web.services;

import com.example.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
