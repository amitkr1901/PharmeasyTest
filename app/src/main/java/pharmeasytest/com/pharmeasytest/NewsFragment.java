package pharmeasytest.com.pharmeasytest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import pharmeasytest.com.pharmeasytest.Model.PostModel;


/**
 * Created by amit on 13/05/17.
 */


public class NewsFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<PostModel> postModelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.newslayout, parent, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(new NewsAdapter(postModelArrayList, R.layout.list_row, getActivity()));

    }

    public void setPostModelArrayList(ArrayList<PostModel> postModelArrayList){
        this.postModelArrayList = postModelArrayList;
    }
}
