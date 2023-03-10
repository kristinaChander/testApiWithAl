package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HeatShieldDto {
    private String material;
    @JsonProperty("size_meters")
    private double sizeMeters;
    @JsonProperty("temp_degrees")
    private double tempDegrees;
    @JsonProperty("dev_partner")
    private String devPartner;
}
