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
public class Fairings {
    private boolean reused;
    @JsonProperty("recovery_attempt")
    private boolean recoveryAttempt;
    private boolean recovered;
    private Object ship;
}
