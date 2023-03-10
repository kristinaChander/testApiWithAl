package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Core {
    @JsonProperty("core_serial")
    private String coreSerial;
    private int flight;
    private Object block;
    private boolean gridfins;
    private boolean legs;
    private boolean reused;
    @JsonProperty("land_success")
    private Object landSuccess;
    @JsonProperty("landing_intent")
    private boolean landingIntent;
    @JsonProperty("landing_type")
    private Object landingType;
    @JsonProperty("landing_vehicle")
    private Object landingVehicle;
}
