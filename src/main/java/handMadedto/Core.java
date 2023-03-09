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
public class Core {
    @JsonProperty("core_serial")
    private String core_serial;
    private int flight;
    private Object block;
    private boolean gridfins;
    private boolean legs;
    private boolean reused;
    @JsonProperty("land_success")
    private Object land_success;
    @JsonProperty("landing_intent")
    private boolean landing_intent;
    @JsonProperty("landing_type")
    private Object landing_type;
    @JsonProperty("landing_vehicle")
    private Object landing_vehicle;
}
