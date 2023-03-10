package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ThrusterDto {
    private String type;
    private int amount;
    private int pods;
    @JsonProperty("fuel_1")
    private String fuel1;
    @JsonProperty("fuel_2")
    private String fuel2;
    private int isp;
    private ThrustDto thrust;
}
