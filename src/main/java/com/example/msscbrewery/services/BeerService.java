package com.example.msscbrewery.services;

import com.example.msscbrewery.web.model.BeerDto;

import java.util.UUID;
@Deprecated
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
