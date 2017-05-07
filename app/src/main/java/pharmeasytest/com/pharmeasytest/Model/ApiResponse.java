package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by amit on 12/01/17.
 */

public class ApiResponse {
    public ArrayList<PostModel> getPostModelList() {
        return postModel;
    }


    public String getStatus() {
        return status;
    }

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("count")
    @Expose
    private String count;

    @SerializedName("count_total")
    @Expose
    private String count_total;

    @SerializedName("pages")
    @Expose
    private String pages;

    @SerializedName("posts")
    @Expose
    private ArrayList<PostModel> postModel;
}
