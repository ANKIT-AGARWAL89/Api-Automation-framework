package AnkitLearningPath.services;

import AnkitLearningPath.base.Base;
import AnkitLearningPath.models.requests.UserLogin;
import io.restassured.response.Response;

public class AuthServices extends Base {
    private static final String LOGIN_ENDPOINT = "/api/auth/login";
    private static final String FORGOT_PASSWORD_ENDPOINT = "/api/auth/forgot-password";
    private static final String RESET_PASSWORD_ENDPOINT = "/api/auth/reset-password";
    private static final String SIGN_UP_ENDPOINT = "/api/auth/signup";


    public static Response login(UserLogin userLogin) {
        return postRequest(userLogin, LOGIN_ENDPOINT);
    }
}
