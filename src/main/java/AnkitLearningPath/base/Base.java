package AnkitLearningPath.base;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static io.restassured.RestAssured.*;

public class Base {
    private static final String BASE_URI = "https://petstore.swagger.io/v2";
    protected static RequestSpecification requestSpecification = given().baseUri(BASE_URI);
    protected static Logger logger = LogManager.getLogger(Base.class);

    protected static Response postRequest(Object payload, String endpoint) {
        logger.info("payload and end point pass into base class");
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endpoint);
    }

    protected static Response getRequest(String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .get(endpoint);
    }

    protected static Response putRequest(Object payload, String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .put(endpoint);
    }

    protected static Response deleteRequest(String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .delete(endpoint);
    }
}