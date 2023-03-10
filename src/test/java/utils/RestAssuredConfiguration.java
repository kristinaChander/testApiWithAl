package utils;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static utils.Constants.BASE_URI;

public class RestAssuredConfiguration {
    public static void configureRestAssured() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = BASE_URI;
        RestAssured.defaultParser = Parser.JSON;
    }
}
