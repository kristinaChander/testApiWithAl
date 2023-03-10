package tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import handMadedto.LaunchGeneralDataDto;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.RestAssuredConfiguration.configureRestAssured;

public class RestAssuredNoSuggestionsTest {
    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void compareLaunchesTest() {
        configureRestAssured();
        String launches = given().contentType(ContentType.JSON)
                .when()
                .get("launches")
                .getBody()
                .asPrettyString();

        String firstLaunch = given().contentType(ContentType.JSON)
                .when()
                .get("launches/1")
                .getBody()
                .asPrettyString();

        assertEquals(getLaunch(firstLaunch), getLaunchesListFromJson(launches).get(0));
    }

    @SneakyThrows
    private List<LaunchGeneralDataDto> getLaunchesListFromJson(String launches) {
        return mapper.readValue(launches, new TypeReference<>() {
        });
    }

    @SneakyThrows
    private LaunchGeneralDataDto getLaunch(String launch) {
        return mapper.readValue(launch, LaunchGeneralDataDto.class);
    }
}
