package AnkitLearningPath.models.store.responses;

import lombok.Data;

@Data
public class PlaceOrderResponse {
    private long id;
    private long petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;
}
