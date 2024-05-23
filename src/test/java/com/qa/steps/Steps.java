package com.qa.steps;

import com.qa.base.Base;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Steps extends Base {

    @Given("Hit the api with get option")
    public void hit_the_api_with_get_option() {
        initapi();

    }
    @Then("print the response")
    public void print_the_response() {
        System.out.println(response.prettyPrint());
    }
    @Then("print the price of the GBP")
    public void print_the_price_of_the_gbp() {
        System.out.println(response.getString("bpi.USD.rate"));
    }


}


