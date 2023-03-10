package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LaunchSite {
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("site_name")
    private String siteName;
    @JsonProperty("site_name_long")
    private String siteNameLong;
}
