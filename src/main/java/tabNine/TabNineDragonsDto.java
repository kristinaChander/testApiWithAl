package tabNine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TabNineDragonsDto {
    private String id;
    private String name;
    private String type;
    private boolean active;
    @JsonProperty("crew_capacity")
    private int crewCapacity;
    @JsonProperty("sidewall_angle_deg")
    private int sidewallAngleDeg;
    @JsonProperty("orbit_duration_yr")
    private int orbitDurationYr;
    @JsonProperty("dry_mass_kg")
    private double dryMassKg;
    @JsonProperty("dry_mass_lb")
    private double dryMassLb;
    @JsonProperty("first_flight")
    private String firstFlight;
    @JsonProperty("heat_shield")
    private HeatShieldDto heatShield;
    private List<ThrusterDto> thrusters;
    @JsonProperty("launch_payload_mass")
    private KgLbMassDto launchPayloadMass;
    @JsonProperty("launch_payload_vol")
    private PayloadVolumeDto launchPayloadVol;
    @JsonProperty("return_payload_mass")
    private KgLbMassDto returnPayloadMass;
    @JsonProperty("return_payload_vol")
    private PayloadVolumeDto returnPayloadVol;
    @JsonProperty("pressurized_capsule")
    private PressurizedCapsuleDto pressurizedCapsule;
    private TrunkDto trunk;
    @JsonProperty("height_w_trunk")
    private FeetMetersDto heightWTrunk;
    private FeetMetersDto diameter;
    @JsonProperty("flickr_images")
    private List<String> flickrImages;
    private String wikipedia;
    private String description;
}
