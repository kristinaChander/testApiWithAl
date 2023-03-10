package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrbitParams {
    @JsonProperty("reference_system")
    private String referenceSystem;
    private String regime;
    private Object longitude;
    @JsonProperty("semi_major_axis_km")
    private Object semiMajorAxisKm;
    private Object eccentricity;
    @JsonProperty("periapsis_km")
    private int periapsisKm;
    @JsonProperty("apoapsis_km")
    private int apoapsisKm;
    @JsonProperty("inclination_deg")
    private int inclinationDeg;
    @JsonProperty("period_min")
    private Object periodMin;
    @JsonProperty("lifespan_years")
    private Object lifespanYears;
    private Object epoch;
    @JsonProperty("mean_motion")
    private Object meanMotion;
    private Object raan;
    @JsonProperty("arg_of_pericenter")
    private Object argOfPericenter;
    @JsonProperty("mean_anomaly")
    private Object meanAnomaly;
}
