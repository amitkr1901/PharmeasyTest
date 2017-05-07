package pharmeasytest.com.pharmeasytest.RestApi;

import pharmeasytest.com.pharmeasytest.Model.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by amit on 11/01/17.
 */

public interface ApiInterface {

    @GET("get_recent_posts/?fields=id,post_title,post_content")
    Call<ApiResponse> getGeo();

}
