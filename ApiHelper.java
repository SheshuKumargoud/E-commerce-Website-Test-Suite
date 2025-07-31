package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHelper {

    public static Response getProductList() {
        return RestAssured.get("https://fakestoreapi.com/products");
    }

    public static Response getUserDetails(int userId) {
        return RestAssured.get("https://fakestoreapi.com/users/" + userId);
    }
}