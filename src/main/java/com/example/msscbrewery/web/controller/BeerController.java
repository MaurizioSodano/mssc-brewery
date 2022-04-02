package com.example.msscbrewery.web.controller;

import com.example.msscbrewery.web.model.BeerDto;
import com.example.msscbrewery.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping({"/{beerId}"})
    public ResponseEntity handlePost(BeerDto beerDto) {

        BeerDto savedDto =beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //TODO: add hostname in the headerValue
        headers.add("Location","/api/v1/beer/"+savedDto.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }
}
