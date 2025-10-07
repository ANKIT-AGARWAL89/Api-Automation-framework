package AnkitLearningPath.models.responses;

import lombok.Data;

import java.util.List;
@Data
public class LoginResponse {
    private String token;
    private String type;
    private int id;
    private String username;
    private String email;
    private List<String> roles;
}
