package handMadedto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Fairings {
    private boolean reused;
    @JsonProperty("recovery_attempt")
    private boolean recoveryAttempt;
    private boolean recovered;
    private Object ship;
}
