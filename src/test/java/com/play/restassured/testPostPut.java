package com.play.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


// this code is not working may be due to Header information will need  more values.
public class testPostPut {


    @Test
    public void testRestAssured()
    {
        /* There are multiple ways to send Body
           Here we are using Json Object
           Need to have dependency json-simple
        */

        RequestSpecification requst = RestAssured.given();
        requst.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("name","Satns");
        json.put("job","PresidentDelievery");

        requst.body(json.toJSONString());

        Response response = requst.post("https://reqres.in/api/users");

        int code = response.getStatusCode();

        ResponseBody payload = response.getBody();

        System.out.println("Get the Response Code  "+code );
        System.out.println("Get the Body  "+payload);






    }
}
