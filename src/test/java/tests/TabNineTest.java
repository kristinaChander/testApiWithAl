package tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import tabNine.TabNineDragonsDto;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.RestAssuredConfiguration.configureRestAssured;

public class TabNineTest {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void spaceXDragonLaunchesTest() {
        configureRestAssured();
        String dragons = given()
                .when()
                .get("dragons")
                .getBody().prettyPrint();
        TabNineDragonsDto dragonFromListDto = getElementFromList(dragons).get(0);
        String dragonId = dragonFromListDto.getId();
        String oneDragonString = given()
                .when()
                .get("dragons/" + dragonId)
                .getBody().prettyPrint();

        TabNineDragonsDto oneDragon = getOneDragon(oneDragonString);
        assertEquals(dragonFromListDto, oneDragon);
    }

    @SneakyThrows
    private TabNineDragonsDto getOneDragon(String oneDragonString) {
        return mapper.readValue(oneDragonString, TabNineDragonsDto.class);
    }

    @SneakyThrows
    private List<TabNineDragonsDto> getElementFromList(String value) {
        return mapper.readValue(value, new TypeReference<>() {});
    }
}
