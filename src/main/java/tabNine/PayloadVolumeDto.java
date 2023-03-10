package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PayloadVolumeDto {
    @JsonProperty("cubic_meters")
    private int cubicMeters;
    @JsonProperty("cubic_feet")
    private int cubicFeet;
}
