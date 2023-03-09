package tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import handMadedto.LaunchGeneralDataDto;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Constants.BASE_URI;

public class RestAssuredNoSuggestionsTest {


    private final ObjectMapper mapper = new ObjectMapper();

    public static void configureRestAssured() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = BASE_URI;
        RestAssured.defaultParser = Parser.JSON;
    }

    @Test
    public void getFeatureToggleOnUser() {
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

        assertEquals(getLaunch(firstLaunch), getLaunchesFromResponse(launches).get(0));
    }

    @SneakyThrows
    private List<LaunchGeneralDataDto> getLaunchesFromResponse(String launches) {
        return mapper.readValue(launches, new TypeReference<>() {
        });
    }

    @SneakyThrows
    private LaunchGeneralDataDto getLaunch(String launch) {
        return mapper.readValue(launch, LaunchGeneralDataDto.class);
    }
}
