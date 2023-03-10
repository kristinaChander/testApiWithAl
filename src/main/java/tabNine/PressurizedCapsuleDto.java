package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class PressurizedCapsuleDto {
    @JsonProperty("payload_volume")
    private PayloadVolumeDto payloadVolume;
}
