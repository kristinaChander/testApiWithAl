package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CargoDto {
    @JsonProperty("solar_array")
    private int solarArray;
    @JsonProperty("unpressurized_cargo")
    private boolean unpressurizedCargo;


}
