package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
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
    @JsonProperty("cap_serial")
    private String capSerial;
    @JsonProperty("mass_returned_kg")
    private double massReturnedKg;
    @JsonProperty("mass_returned_lbs")
    private double massReturnedLbs;
    @JsonProperty("flight_time_sec")
    private int flightTimeSec;
    @JsonProperty("cargo_manifest")
    private String cargoManifest;
    private String uid;
}
