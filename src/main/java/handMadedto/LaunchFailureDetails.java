package handMadedto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LaunchFailureDetails {
    public int time;
    public Object altitude;
    public String reason;
}
