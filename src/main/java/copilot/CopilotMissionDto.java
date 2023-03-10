package copilot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CopilotMissionDto {
    @JsonProperty("mission_name")
    private String missionName;
    @JsonProperty("mission_id")
    private String missionId;
    private List<String> manufacturers;
    @JsonProperty("payload_ids")
    private List<String> payloadIds;
    private String wikipedia;
    private String website;
    private String twitter;
    private String description;
}
