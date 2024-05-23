package com.qa.base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Base {
  public static  JsonPath response;

    public void initapi() {
        RestAssured.baseURI="https://api.coindesk.com/v1/bpi/currentprice.json";
        Response res = RestAssured.get();
        response = res.jsonPath();
    }

}
