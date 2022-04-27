package com.example.msscbrewery.web.mapper;

import com.example.msscbrewery.domain.Beer;
import com.example.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDtoV2 dto);

    BeerDtoV2 beerToBeerDto(Beer beer);
}
