package com.play.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class restGet {
    @Test

    public void testResponseCode(){
        String uri = "https://samples.agromonitoring.com/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        Response code = RestAssured.get(uri);
        System.out.println("Response Code "+ code.getStatusCode());
        System.out.println("Respose data"+ code.getBody());

    }
}
