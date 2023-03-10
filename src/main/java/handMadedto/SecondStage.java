package handMadedto;

import lombok.Data;

import java.util.List;

@Data
public class SecondStage {
    private int block;
    private List<Payload> payloads;
}
