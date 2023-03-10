package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Links {
    @JsonProperty("mission_patch")
    private String missionPatch;
    @JsonProperty("mission_patch_small")
    private String missionPatchSmall;
    @JsonProperty("reddit_campaign")
    private Object redditCampaign;
    @JsonProperty("reddit_launch")
    private Object redditLaunch;
    @JsonProperty("reddit_recovery")
    private Object redditRecovery;
    @JsonProperty("reddit_media")
    private Object redditMedia;
    private Object presskit;
    @JsonProperty("article_link")
    private String articleLink;
    private String wikipedia;
    @JsonProperty("video_link")
    private String videoLink;
    @JsonProperty("youtube_id")
    private String youtubeId;
    @JsonProperty("flickr_images")
    private List<Object> flickrImages;
}
