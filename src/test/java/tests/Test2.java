package tests;

import static io.restassured.RestAssured.*;

import AnkitLearningPath.base.Base;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Test2 extends Base {

    @Test(description = "Check if login functionality working fine!")
    public void loginTest2() {
        Response response = postRequest("{\n" +
                "  \"username\": \"string\",\n" +
                "  \"password\": \"string\"\n" +
                "}", "/api/auth/login");
        System.out.println(response.asPrettyString());
    }
}
