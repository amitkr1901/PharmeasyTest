package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by akumar on 5/6/2017.
 */

public class ImageModel {
    @SerializedName("full")
    @Expose
    private ImageSubModel full;
    @SerializedName("thumbnail")
    @Expose
    private ImageSubModel thumbnail;
    @SerializedName("medium")
    @Expose
    private ImageSubModel medium;
    @SerializedName("medium_large")
    @Expose
    private ImageSubModel medium_large;
    @SerializedName("large")
    @Expose
    private ImageSubModel large;
    @SerializedName("vce-lay-a")
    @Expose
    private ImageSubModel vce_lay_a;
    @SerializedName("vce-lay-a-nosid")
    @Expose
    private ImageSubModel vce_lay_a_nosid;
    @SerializedName("vce-lay-b")
    @Expose
    private ImageSubModel vce_lay_b;
    @SerializedName("vce-lay-d")
    @Expose
    private ImageSubModel vce_lay_d;
    @SerializedName("vce-fa-full")
    @Expose
    private ImageSubModel vce_fa_full;
    @SerializedName("vce-fa-grid")
    @Expose
    private ImageSubModel vce_fa_grid;

}
