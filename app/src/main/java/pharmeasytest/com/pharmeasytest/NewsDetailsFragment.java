package pharmeasytest.com.pharmeasytest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import butterknife.Bind;
import butterknife.ButterKnife;
import pharmeasytest.com.pharmeasytest.Model.ImageModel;
import pharmeasytest.com.pharmeasytest.Model.ImageSubModel;
import pharmeasytest.com.pharmeasytest.Model.PostModel;

/**
 * Created by amit on 13/05/17.
 */

public class NewsDetailsFragment extends Fragment {

    @Bind(R.id.image)
    ImageView image;

    @Bind(R.id.newsDetail)
    TextView newsDetail;



    PostModel postModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.newsdetail, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ImageModel imageModel =  postModel.getThumbnail_images();
        ImageLoader imageLoader = ImageLoader.getInstance();

        ImageSubModel imageSubModel = imageModel.getLarge();
        imageLoader.displayImage(imageSubModel.getUrl(), image);

        newsDetail.setText(postModel.getContent());
    }


    public void setPostModel(PostModel postModel) {
        this.postModel = postModel;
    }
}
