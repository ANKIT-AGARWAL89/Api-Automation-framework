package AnkitLearningPath.models.pet.responses;

import AnkitLearningPath.models.pet.requests.Category;
import AnkitLearningPath.models.pet.requests.Tag;
import lombok.Data;

import java.util.List;

@Data
public class PetResponse {
    private long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;
}
