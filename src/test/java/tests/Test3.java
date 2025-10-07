package tests;

import AnkitLearningPath.models.requests.UserLogin;
import AnkitLearningPath.models.responses.LoginResponse;
import AnkitLearningPath.services.AuthServices;
import io.restassured.response.Response;
import lombok.Builder;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test3 {
    // tests -> services -> base (if required)  => SOM (Service object model)
    @Test(description = "Check if login functionality working fine!")
    public void loginTest2() {
//        Response response = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").body("{\n" +
//                "  \"username\": \"string\",\n" +
//                "  \"password\": \"string\"\n" +
//                "}").post("/api/auth/login");
        UserLogin userLogin = UserLogin.builder()
                .username("string")
                .password("string").build();
        Response response = AuthServices.login(userLogin);
        LoginResponse loginResponse = AuthServices.login(userLogin).as(LoginResponse.class);
        int id = loginResponse.getId();
        Assert.assertEquals(id, 38);
    }
}
