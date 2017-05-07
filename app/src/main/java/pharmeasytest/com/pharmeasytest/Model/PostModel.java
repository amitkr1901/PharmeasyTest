package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akumar on 5/6/2017.
 */

public class PostModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_plain")
    @Expose
    private String title_plain;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;
    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("categories")
    @Expose
    private ArrayList<CategoryModel> categoryModel;

    @SerializedName("author")
    @Expose
    private AuthorModel author;

    @SerializedName("attachments")
    @Expose
    private List<AttachmentModel> attachmentList;

    @SerializedName("comment_count")
    @Expose
    private String comment_count;

    @SerializedName("comment_status")
    @Expose
    private String comment_status;

    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;




    @SerializedName("thumbnail_size")
    @Expose
    private String thumbnail_size;

    @SerializedName("thumbnail_images")
    @Expose
    private ImageModel thumbnail_images;


}
