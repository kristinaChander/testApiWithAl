package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class LaunchGeneralDataDto {
    @JsonProperty("flight_number")
    private int flightNumber;
    @JsonProperty("mission_name")
    private String missionName;
    @JsonProperty("mission_id")
    private List<Object> missionId;
    private boolean upcoming;
    @JsonProperty("launch_year")
    private String launchYear;
    @JsonProperty("launch_date_unix")
    private int launchDateUnix;
    @JsonProperty("launch_date_utc")
    private String launchDateUtc;
    @JsonProperty("launch_date_local")
    private String launchDateLocal;
    @JsonProperty("is_tentative")
    private boolean isTentative;
    @JsonProperty("tentative_max_precision")
    private String tentativeMaxPrecision;
    private boolean tbd;
    @JsonProperty("launch_window")
    private int launchWindow;
    private Rocket rocket;
    private List<Object> ships;
    private Telemetry telemetry;
    @JsonProperty("launch_site")
    private LaunchSite launchSite;
    @JsonProperty("launch_success")
    private boolean launchSuccess;
    @JsonProperty("launch_failure_details")
    private LaunchFailureDetails launchFailureDetails;
    private Links links;
    private String details;
    @JsonProperty("static_fire_date_utc")
    private String staticFireDateUtc;
    @JsonProperty("static_fire_date_unix")
    private int staticFireDateUnix;
    private Timeline timeline;
    private List<String> crew;
    @JsonProperty("last_date_update")
    private String lastDateUpdate;
    @JsonProperty("last_ll_launch_date")
    private String lastLlLaunchDate;
    @JsonProperty("last_ll_update")
    private String lastLlUpdate;
    @JsonProperty("last_wiki_launch_date")
    private String lastWikiLaunchDate;
    @JsonProperty("last_wiki_revision")
    private String lastWikiRevision;
    @JsonProperty("last_wiki_update")
    private String lastWikiUpdate;
    @JsonProperty("launch_date_source")
    private String launchDateSource;
}
