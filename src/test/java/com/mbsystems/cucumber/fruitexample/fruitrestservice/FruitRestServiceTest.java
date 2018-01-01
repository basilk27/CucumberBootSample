package com.mbsystems.cucumber.fruitexample.fruitrestservice;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FruitRestServiceTest extends FruitIntergrationBaseRestServiceTest {

    @Given("^the system knows about the following fruit:$")
    public void the_system_knows_about_the_following_fruit(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }

    @When("^the client request GET /fruits$")
    public void the_client_request_GET_fruits() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        executeGet("http://localhost:8080/fruits");
    }

    @Then("^the respones should be JSON$")
    public void the_respones_should_be_JSON(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

}
