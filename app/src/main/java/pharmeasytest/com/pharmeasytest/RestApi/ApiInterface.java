package pharmeasytest.com.pharmeasytest.RestApi;

import pharmeasytest.com.pharmeasytest.Model.GeoResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by amit on 11/01/17.
 */

public interface ApiInterface {

    @FormUrlEncoded
    @POST("citiesJSON/")
    Call<GeoResponse> getGeo(@Field("north") String north, @Field("south") String south, @Field("east")
            String east, @Field("west") String west, @Field("lang") String lang, @Field("username") String username);

}
