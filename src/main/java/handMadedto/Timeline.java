package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Timeline {
    private int webcast_liftoff;
    private int go_for_prop_loading;
    private int rp1_loading;
    private int stage1_lox_loading;
    private int stage2_lox_loading;
    private int engine_chill;
    private int prelaunch_checks;
    private int propellant_pressurization;
    private int go_for_launch;
    private int ignition;
    private int liftoff;
    private int maxq;
    private int meco;
    private int stage_sep;
    private int second_stage_ignition;
    @JsonProperty("seco-1")
    private int seco_1;
    private int dragon_separation;
    private int dragon_solar_deploy;
    private int dragon_bay_door_deploy;
    private int fairing_deploy;
    private int payload_deploy;
    private int second_stage_restart;
    @JsonProperty("seco-2")
    private int seco_2;
    private int webcast_launch;
    private int payload_deploy_1;
    private int payload_deploy_2;
    private int first_stage_boostback_burn;
    private int first_stage_entry_burn;
    private int first_stage_landing;
    private int beco;
    private int side_core_sep;
    private int side_core_boostback;
    private int center_stage_sep;
    private int center_core_boostback;
    private int side_core_entry_burn;
    private int center_core_entry_burn;
    private int side_core_landing;
    private int center_core_landing;
    private int first_stage_landing_burn;
    private int stage1_rp1_loading;
    private int stage2_rp1_loading;
    @JsonProperty("seco-3")
    private int seco_3;
    @JsonProperty("seco-4")
    private int seco_4;
}
