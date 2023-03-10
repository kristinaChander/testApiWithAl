package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ThrustDto {
    @JsonProperty("kN")
    private double kn;
    private double lbf;
}
