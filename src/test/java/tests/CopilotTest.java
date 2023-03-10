package tests;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import copilot.CopilotMissionDto;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.RestAssuredConfiguration.configureRestAssured;

public class CopilotTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void getSpaceXMissionTest() {
        configureRestAssured();
        String missions = given()
                .when()
                .get("missions")
                .getBody()
                .prettyPrint();

        CopilotMissionDto firstMissionDto = getMissionList(missions).get(0);
        String missionId = firstMissionDto.getMissionId();
        String oneMissionJson = given()
                .when()
                .get("missions/" + missionId)
                .getBody().prettyPrint();
        CopilotMissionDto oneMission = getOneMission(oneMissionJson);
        assertEquals(firstMissionDto, oneMission);

    }

    @SneakyThrows
    private CopilotMissionDto getOneMission(String oneMissionJson) {
        return mapper.readValue(oneMissionJson, CopilotMissionDto.class);
    }

    @SneakyThrows
    private List<CopilotMissionDto> getMissionList(String missions) {
        return mapper.readValue(missions, new TypeReference<>() {
        });
    }

}
