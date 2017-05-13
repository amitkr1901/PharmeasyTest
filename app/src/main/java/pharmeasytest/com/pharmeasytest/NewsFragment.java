package pharmeasytest.com.pharmeasytest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import pharmeasytest.com.pharmeasytest.Model.ApiResponse;
import pharmeasytest.com.pharmeasytest.Model.PostModel;
import pharmeasytest.com.pharmeasytest.RestApi.ApiInterface;
import pharmeasytest.com.pharmeasytest.RestApi.RestApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by amit on 13/05/17.
 */


public class NewsFragment extends Fragment {
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.newslayout, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        final ApiInterface apiService =
                RestApiClient.getClient().create(ApiInterface.class);

        Call<ApiResponse> call = apiService.getGeo();
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                ArrayList<PostModel> responseList = response.body().getPostModelList();

                if (responseList == null) {

                    final AlertDialog alertDialog = new AlertDialog.Builder(
                            getActivity()).create();

                    alertDialog.setTitle("Alert Dialog");
                    alertDialog.setMessage("Something went wrong while fetching data");
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertDialog.dismiss();
                        }
                    });

                    alertDialog.show();
                } else {
//                    Now you use the data to display wherever you want.
                    recyclerView.setAdapter(new NewsAdapter(responseList, R.layout.list_row, getActivity()));
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                System.out.println("hi th eds");
            }
        });

    }
}
