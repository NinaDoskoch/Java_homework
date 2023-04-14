package com.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReqresTest {

   @BeforeClass
   public void setup() {
      RestAssured.baseURI = "https://reqres.in";
   }

   @Test
   public void testListUsers() {
      Response response = given()
         .queryParam("page", 1)
         .when()
         .get("/api/users");

      response.then()
         .statusCode(200)
         .body("page", equalTo(1))
         .body("per_page", equalTo(6))
         .body("total", greaterThanOrEqualTo(6))
         .body("total_pages", greaterThanOrEqualTo(1))
         .body("data", hasSize(6));
   }

   @Test
   public void testSingleUser() {
      Response response = given()
         .pathParam("id", 2)
         .when()
         .get("/api/users/{id}");

      response.then()
         .statusCode(200)
         .body("data.id", equalTo(2))
         .body("data.email", notNullValue())
         .body("data.first_name", notNullValue())
         .body("data.last_name", notNullValue())
         .body("data.avatar", notNullValue());
   }

   @Test
   public void testCreateUser() {
      String requestBody = "{\"name\":\"John\",\"job\":\"Software Engineer\"}";

      Response response = given()
         .contentType("application/json")
         .body(requestBody)
         .when()
         .post("/api/users");

      response.then()
         .statusCode(201)
         .body("name", equalTo("John"))
         .body("job", equalTo("Software Engineer"))
         .body("id", notNullValue())
         .body("createdAt", notNullValue());
   }
}


