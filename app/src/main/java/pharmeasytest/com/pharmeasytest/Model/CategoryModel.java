package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by akumar on 5/6/2017.
 */

public class CategoryModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("post_count")
    @Expose
    private String post_count;


}
