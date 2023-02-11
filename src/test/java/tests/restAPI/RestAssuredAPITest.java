package tests.restAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;


import static org.hamcrest.Matchers.equalTo;

//public class RestAssuredAPITest {
//
//    static String accessToken = "BQC9kF_xjJiZ9xYVTo5ICT2Ksem2Xgh2vgIFkUoxsjq0jAMlbjq7PIabJBLl5X1NrVn5j1CEwoo1ZdFejVf6ah-HKccaF9Jp-Sn8wQp4qoiLM_Z6M3Uc6UaZUqJSrRNOX4V4epd0vx9FCooZMeB1una7ljzzi6BbQ-eojw9EbM0voUagx1CbGqRAVMyXVvcNMmlfXp-btjlC9EHVnHLR8ci_VtgrYEU-cs_GIPa8938RxPy-6yjzhhzS1O5O0GCLChhTuGBHa-fVX4ghomOg95uqaZzY3acm_9Rh1C0K0QlBa7PfQ1GXp8ibwhLW4lv4gHxZHzAjusrxBw";
//

    //static String token;

    //private static String token;

//    public static void main(String[] args) {
//
//        System.out.println("Great!");
//
//    }


//    @BeforeTest
//    //public void setUp() {
//    public static void main(String[] args){
//        public static String accessToken = "BQC9kF_xjJiZ9xYVTo5ICT2Ksem2Xgh2vgIFkUoxsjq0jAMlbjq7PIabJBLl5X1NrVn5j1CEwoo1ZdFejVf6ah-HKccaF9Jp-Sn8wQp4qoiLM_Z6M3Uc6UaZUqJSrRNOX4V4epd0vx9FCooZMeB1una7ljzzi6BbQ-eojw9EbM0voUagx1CbGqRAVMyXVvcNMmlfXp-btjlC9EHVnHLR8ci_VtgrYEU-cs_GIPa8938RxPy-6yjzhhzS1O5O0GCLChhTuGBHa-fVX4ghomOg95uqaZzY3acm_9Rh1C0K0QlBa7PfQ1GXp8ibwhLW4lv4gHxZHzAjusrxBw";
//
//        //System.out.println("Great!");
//    }
    //static String token = "BQDw716QkiXsLu-Mbj-K8GvzibrX6k_vqwVTFodLwes_xJvR6kdkhvDDPkI23aCcKgrnykcxUUwlggBQbak1StfF1fAjmapk7DeuPBN1mdES-EtoXct91JfTr2DwfL49-n3RvfVfSNvNXOQFhtYXxK-38xBL9cxMUuu73tH26aX2V_tuGenMCWfr0xTc-OVMVuqo";


//    @Test
//    public static void main(String[] args) {
//
//        System.out.println("Great!");
//    }

public class RestAssuredAPITest {

    static String accessToken = "BQBScKhs5siFtuBot9d-IMxVn02aANhaDhNi8iUqHNlhKHenR0GZLcLVmy6enINAvdc0V235JIWbKFoVxEYpxrYgrZ34onO6ov5Te733JPwCRARHjuPu2l_AmASUkYpzR5qBPZ8xaovvPZujpDfte5ZPm2nM6BBwgwcxsNPgIyhBxm90zW-ZirI16FjAUih2ZyFby7kxjHTsRdp2J_kyMhEz8ZqhTXnlI-AO9-HfPpfZnMUB3ihKyGYDvb3ju8WivXoT8-1uoqbuok1ij8FXdVnZ7lgezop4UGiQpunuG-pzRjcvbAAGuSDKJ5-qlII16apsd1SMaXGEtA";



    //Get artist
        @Test
        public void getArtist(){

            ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                    .baseUri("https://api.spotify.com/").basePath("v1")
                    .accept(ContentType.JSON).header("Authorization", "Bearer " + accessToken)
                    .when()
                    .get("/artists/1RyvyyTE3xzB2ZywiAwp0i")
                    .then()
                    .log()
                    .all()
                    .assertThat().statusCode(200);

        }


        //Get Artist`s Albums
        @Test
        public void getArtistAlbums(){
            ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                    .baseUri("https://api.spotify.com/").basePath("v1")
                    .accept(ContentType.JSON).header("Authorization", "Bearer " + accessToken)
                    .when()
                    .get("/artists/1RyvyyTE3xzB2ZywiAwp0i/albums")
                    .then()
                    .log()
                    .all()
                    .assertThat().statusCode(200);
        }



    @Test
    public void getArtistAlbumsNegative(){
        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://api.spotify.com/").basePath("v1")
                .accept(ContentType.JSON).header("Authorization", "Bearer " + accessToken)
                .when()
                .get("/artists/1111111111111111/albums")
                .then()
                .log()
                .all()
                .assertThat().statusCode(400);
    }


    @Test
    public void createPlaylistNegative(){

        String jsonBody = "{" +
                "   \"name\":\"MyNewPlaylist\",\n" +
                "   \"description\":\"This is the new playlist for testing framework\",\n" +
                "   \"public\":\"false\"\n" +
                "}";

        ValidatableResponse response = RestAssured.given().contentType(ContentType.JSON)
                .baseUri("https://api.spotify.com/").basePath("v1")
                .accept(ContentType.JSON).header("Authorization", "Bearer " + accessToken)
                .and()
                .body(jsonBody)
                .when()
                .post("/users/smedjan/playlists")
                .then()
                .log()
                .all()
                .assertThat().statusCode(403)
                .and()
                .statusLine("HTTP/1.1 403 Forbidden")
                .body("error.status", equalTo(403))
                .body("error.message", equalTo("You cannot create a playlist for another user."));
                //.body(Matchers.equalTo("{\"code\":403,\"meta\":null,\"data\":{\"status\":\"403\","
                        //+ "\"message\":\"You cannot create a playlist for another user.\"}"));
    }

}






//    static String link = "https://api.spotify.com/v1/artists/1RyvyyTE3xzB2ZywiAwp0i";
//    static String token = "BQAwx74RzgMNXHKHGnnC9_LCn7jYmPVUUE4Xy-POh5VSzhtSPZH04TOwHknRyDVNRok3P6QYnOO9MXYI5FHFtwrZmy9Ybu4srWNBhopyM3vulYo-Sjsd7ytmohSytpCWqE2VLRWxdMuogvdzHu-28NwgwOhpXoF8ibK3DVtKtTHSK322DJWOXDiqiTRsluCMLUIc";
//
//
//
//    public static void main(String[] args) {
//        ValidatableResponse response = RestAssured.given()
//                .header("Authorization", "Bearer " + token)
//                .when()
//                .get(link)
//                .then()
//                .log()
//                .all()
//                .assertThat().statusCode(200);
//
//    }
//}



    //@Test
//    public static void main(String[] args) {
//        ValidatableResponse response = RestAssured.given()
//                .header("Authorization", token)
//                .when()
//                .get(link)
//                .then()
//                .log()
//                .all()
//                .assertThat().statusCode(200);
//
//        //response.prettyPrint();
//    }
//}




    //@Test
//    public static void main(String[] args) {
//    //public void GetUserId() {
//        RestAssured.given()
//                .baseUri("https://api.spotify.com/").basePath("v1")
//                .header("Authorization", "Bearer " + token)
//                .when().get("/artists")
//                .then()
//                .statusCode(200);
//               // .statusLine("HTTP/1.1 200 OK");
//    }
//}

//    static String link = "https://api.spotify.com/v1/artists";

//    static String token = "BQBeoELTxkE0LDA9IHB43JF0LymP_qjjquE2oDXHPINR1R6Xnqj1m_U_dmIBW7lifbabkfZVtSP_iCsEENkwOHmjsajECFmUcbuhLgEg5";
//
//    public static void main(String[] args) {
//        Response response = RestAssured.given().header("Authorization", "bearer " + token).when().get(link);
//        response.then().assertThat().statusCode(200);  //This fails
//        //response.then().assertThat().statusCode(401);  //This passes
//    }
    //}



