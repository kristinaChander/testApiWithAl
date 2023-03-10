package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Telemetry {
    @JsonProperty("flight_club")
    private Object flightClub;

}
