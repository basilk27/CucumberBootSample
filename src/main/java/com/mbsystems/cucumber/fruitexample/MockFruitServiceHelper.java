package com.mbsystems.cucumber.fruitexample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MockFruitServiceHelper {

    public ArrayList<Fruit> getAllFruits()
    {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        Fruit fruit1 = new Fruit();
        fruit1.setName( "banana" );
        fruit1.setColor( "yellow" );
        Fruit fruit2 = new Fruit();
        fruit2.setName( "strawberry" );
        fruit2.setColor( "red" );
        fruitArrayList.add( fruit1  );
        fruitArrayList.add( fruit2 );

        return fruitArrayList;

    }
}
