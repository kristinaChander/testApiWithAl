package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrunkDto {
    @JsonProperty("payload_volume")
    private PayloadVolumeDto payloadVolume;
    @JsonProperty("cargo")
    private CargoDto cargo;
}
