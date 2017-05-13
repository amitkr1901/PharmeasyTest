package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by akumar on 5/6/2017.
 */

public class ImageModel {
    public ImageSubModel getFull() {
        return full;
    }

    public void setFull(ImageSubModel full) {
        this.full = full;
    }

    public ImageSubModel getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(ImageSubModel thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ImageSubModel getMedium() {
        return medium;
    }

    public void setMedium(ImageSubModel medium) {
        this.medium = medium;
    }

    public ImageSubModel getLarge() {
        return large;
    }

    public void setLarge(ImageSubModel large) {
        this.large = large;
    }

    public ImageSubModel getMedium_large() {
        return medium_large;
    }

    public void setMedium_large(ImageSubModel medium_large) {
        this.medium_large = medium_large;
    }

    public ImageSubModel getVce_lay_a() {
        return vce_lay_a;
    }

    public void setVce_lay_a(ImageSubModel vce_lay_a) {
        this.vce_lay_a = vce_lay_a;
    }

    public ImageSubModel getVce_lay_a_nosid() {
        return vce_lay_a_nosid;
    }

    public void setVce_lay_a_nosid(ImageSubModel vce_lay_a_nosid) {
        this.vce_lay_a_nosid = vce_lay_a_nosid;
    }

    public ImageSubModel getVce_lay_b() {
        return vce_lay_b;
    }

    public void setVce_lay_b(ImageSubModel vce_lay_b) {
        this.vce_lay_b = vce_lay_b;
    }

    public ImageSubModel getVce_lay_d() {
        return vce_lay_d;
    }

    public void setVce_lay_d(ImageSubModel vce_lay_d) {
        this.vce_lay_d = vce_lay_d;
    }

    public ImageSubModel getVce_fa_full() {
        return vce_fa_full;
    }

    public void setVce_fa_full(ImageSubModel vce_fa_full) {
        this.vce_fa_full = vce_fa_full;
    }

    public ImageSubModel getVce_fa_grid() {
        return vce_fa_grid;
    }

    public void setVce_fa_grid(ImageSubModel vce_fa_grid) {
        this.vce_fa_grid = vce_fa_grid;
    }

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
