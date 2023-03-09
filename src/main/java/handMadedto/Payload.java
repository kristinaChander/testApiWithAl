package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payload {
    @JsonProperty("payload_id")
    private String payloadId;
    @JsonProperty("norad_id")
    private List<Object> noradId;
    private boolean reused;
    private ArrayList<String> customers;
    private String nationality;
    private String manufacturer;
    @JsonProperty("payload_type")
    private String payloadType;
    @JsonProperty("payload_mass_kg")
    private int payloadMassKg;
    @JsonProperty("payload_mass_lbs")
    private int payloadMassLbs;
    private String orbit;
    @JsonProperty("orbit_params")
    private OrbitParams orbitParams;
    private String cap_serial;
    private double mass_returned_kg;
    private double mass_returned_lbs;
    private int flight_time_sec;
    private String cargo_manifest;
    private String uid;
}
