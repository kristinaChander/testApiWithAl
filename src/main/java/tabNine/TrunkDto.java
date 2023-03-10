package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrunkDto {
    @JsonProperty("trunk_volume")
    private PayloadVolumeDto trunkVolume;
    @JsonProperty("cargo")
    private CargoDto cargo;
}
