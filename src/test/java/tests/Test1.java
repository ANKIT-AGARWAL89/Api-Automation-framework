package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

public class Test1 {
    @Test(description = "Check if login functionality working fine!")
    public void loginTest() {
        RequestSpecification x = RestAssured.given().baseUri("http://64.227.160.186:8080");
        RequestSpecification y = x.header("Content-Type", "application/json");
        RequestSpecification z = y.body("{\n" +
                "  \"username\": \"string\",\n" +
                "  \"password\": \"string\"\n" +
                "}");
        Response response = z.post("/api/auth/login");
        System.out.println(response.asPrettyString());
    }
}
