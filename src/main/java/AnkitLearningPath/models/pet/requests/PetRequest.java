package AnkitLearningPath.models.pet.requests;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PetRequest {
    private int id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;
}
