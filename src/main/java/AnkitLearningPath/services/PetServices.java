package AnkitLearningPath.services;

import AnkitLearningPath.base.Base;
import AnkitLearningPath.models.pet.requests.PetRequest;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class PetServices extends Base {
    private static Logger logger = LogManager.getLogger(PetServices.class);
    private static final String ADD_OR_UPDATE_PET = "/pet";
    private static final String ADD_PET_IMAGE = "/pet/{petId}/uploadImage";
    private static final String PET_STATUS = "/pet/findByStatus";


    public static void addpet(Object petRequest) {
        logger.info("called the post request method of base class in petservices class");
        Response response = Base.postRequest(petRequest, ADD_OR_UPDATE_PET);
        logger.info("response got successfully");
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
