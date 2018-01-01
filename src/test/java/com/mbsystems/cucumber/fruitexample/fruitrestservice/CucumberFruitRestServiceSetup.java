package com.mbsystems.cucumber.fruitexample.fruitrestservice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions( format = "pretty", features = "src/test/resources/fruitrestservice")
public class CucumberFruitRestServiceSetup {
}
