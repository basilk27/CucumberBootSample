package com.mbsystems.cucumber.fruitexample.fruitrestservice;

import com.mbsystems.cucumber.fruitexample.Fruit;
import com.mbsystems.cucumber.fruitexample.FruitexampleApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@ContextConfiguration(classes = FruitexampleApplication.class)
@WebAppConfiguration
@SpringBootTest
public class FruitIntergrationBaseRestServiceTest {

    @Autowired
    RestTemplate restTemplate;

    public void executeGet(String url) {
        ParameterizedTypeReference<List<Fruit>> responseType = new ParameterizedTypeReference<List<Fruit>>() {};
        ResponseEntity<List<Fruit>> responseEntity = restTemplate.exchange( url, HttpMethod.GET, null, responseType );
        List<Fruit> fruitList = responseEntity.getBody();
        System.out.println( fruitList );
    }
}
