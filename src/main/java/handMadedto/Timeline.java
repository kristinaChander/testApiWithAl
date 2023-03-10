package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Timeline {
    @JsonProperty("webcast_liftoff")
    private int webcastLiftoff;
    @JsonProperty("go_for_prop_loading")
    private int goForPropLoading;
    @JsonProperty("rp1_loading")
    private int rp1Loading;
    @JsonProperty("stage1_lox_loading")
    private int stage1LoxLoading;
    @JsonProperty("stage2_lox_loading")
    private int stage2LoxLoading;
    @JsonProperty("engine_chill")
    private int engineChill;
    @JsonProperty("prelaunch_checks")
    private int prelaunchChecks;
    @JsonProperty("propellant_pressurization")
    private int propellantPressurization;
    @JsonProperty("go_for_launch")
    private int goForLaunch;
    private int ignition;
    private int liftoff;
    private int maxq;
    private int meco;
    @JsonProperty("stage_sep")
    private int stageSep;
    @JsonProperty("second_stage_ignition")
    private int secondStageIgnition;
    @JsonProperty("seco-1")
    private int seco1;
    @JsonProperty("dragon_separation")
    private int dragonSeparation;
    @JsonProperty("dragon_solar_deploy")
    private int dragonSolarDeploy;
    @JsonProperty("dragon_bay_door_deploy")
    private int dragonBayDoorDeploy;
    @JsonProperty("fairing_deploy")
    private int fairingDeploy;
    @JsonProperty("payload_deploy")
    private int payloadDeploy;
    @JsonProperty("second_stage_restart")
    private int secondStageRestart;
    @JsonProperty("seco-2")
    private int seco2;
    @JsonProperty("webcast_launch")
    private int webcastLaunch;
    @JsonProperty("payload_deploy_1")
    private int payloadDeploy1;
    @JsonProperty("payload_deploy_2")
    private int payloadDeploy2;
    @JsonProperty("first_stage_boostback_burn")
    private int firstStageBoostbackBurn;
    @JsonProperty("first_stage_entry_burn")
    private int firstStageEntryBurn;
    @JsonProperty("first_stage_landing")
    private int firstStageLanding;
    private int beco;
    @JsonProperty("side_core_sep")
    private int sideCoreSep;
    @JsonProperty("side_core_boostback")
    private int sideCoreBoostback;
    @JsonProperty("center_stage_sep")
    private int centerStageSep;
    @JsonProperty("center_core_boostback")
    private int centerCoreBoostback;
    @JsonProperty("side_core_entry_burn")
    private int sideCoreEntryBurn;
    @JsonProperty("center_core_entry_burn")
    private int centerCoreEntryBurn;
    @JsonProperty("side_core_landing")
    private int sideCoreLanding;
    @JsonProperty("center_core_landing")
    private int centerCoreLanding;
    @JsonProperty("first_stage_landing_burn")
    private int firstStageLandingBurn;
    @JsonProperty("stage1_rp1_loading")
    private int stage1Rp1Loading;
    @JsonProperty("stage2_rp1_loading")
    private int stage2Rp1Loading;
    @JsonProperty("seco-3")
    private int seco3;
    @JsonProperty("seco-4")
    private int seco4;
}
