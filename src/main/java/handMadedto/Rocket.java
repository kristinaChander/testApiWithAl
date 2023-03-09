package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rocket {
    @JsonProperty("rocket_id")
    private String rocketId;
    @JsonProperty("rocket_name")
    private String rocketName;
    @JsonProperty("rocket_type")
    private String rocketType;
    @JsonProperty("first_stage")
    private FirstStage firstStage;
    @JsonProperty("second_stage")
    private SecondStage secondStage;
    private Fairings fairings;
}
