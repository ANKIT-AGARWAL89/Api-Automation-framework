package AnkitLearningPath.services;

import AnkitLearningPath.base.Base;
import AnkitLearningPath.models.pet.requests.PetRequest;
import io.restassured.response.Response;
import org.testng.Assert;

public class PetServices extends Base {
    private static final String ADD_OR_UPDATE_PET = "/pet";
    private static final String ADD_PET_IMAGE = "/pet/{petId}/uploadImage";
    private static final String PET_STATUS = "/pet/findByStatus";


    public static void addpet(Object petRequest) {
        Response response = Base.postRequest(petRequest, ADD_OR_UPDATE_PET);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
