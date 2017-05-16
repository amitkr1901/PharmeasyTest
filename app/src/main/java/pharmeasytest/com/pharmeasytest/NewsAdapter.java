package pharmeasytest.com.pharmeasytest;

/**
 * Created by amit on 13/05/17.
 */


import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import pharmeasytest.com.pharmeasytest.Model.PostModel;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private int rowLayout;
    ArrayList<PostModel> postModelList;
    FragmentActivity activity;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityName;
        RelativeLayout cityLayout;

        public ViewHolder(View v) {
            super(v);
            cityLayout = (RelativeLayout) v.findViewById(R.id.cityLayout);
            cityName = (TextView) v.findViewById(R.id.cityName);
        }

    }

    public NewsAdapter(ArrayList<PostModel> postModelList, int rowLayout, FragmentActivity activity) {
        this.postModelList = postModelList;
        this.rowLayout = rowLayout;
        this.activity = activity;
    }

    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                    int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


        holder.cityName.setText(postModelList.get(position).getTitle());

        holder.cityLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsDetailsFragment newsDetailsFragment = new NewsDetailsFragment();
                newsDetailsFragment.setPostModel(postModelList.get(position));
                activity.getSupportFragmentManager().beginTransaction().
                        add(R.id.childContent, newsDetailsFragment, "newsDetailsFragmentTag").addToBackStack("newsDetailsFragment").
                        commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return postModelList.size();
    }


}