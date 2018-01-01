package com.mbsystems.cucumber.fruitexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FruitController {

    @Autowired
    private MockFruitServiceHelper fruitServiceHelper;

    @GetMapping(path = "/fruits", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Fruit>> getFruitList() {
        ArrayList<Fruit> fruitArrayList = fruitServiceHelper.getAllFruits();
        return new ResponseEntity<>( fruitArrayList, HttpStatus.OK );
    }
}
