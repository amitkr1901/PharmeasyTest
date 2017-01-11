package pharmeasytest.com.pharmeasytest.Fragments;

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

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import pharmeasytest.com.pharmeasytest.Adapter.GeoAdapter;
import pharmeasytest.com.pharmeasytest.Model.GeoModel;
import pharmeasytest.com.pharmeasytest.Model.GeoResponse;
import pharmeasytest.com.pharmeasytest.R;
import pharmeasytest.com.pharmeasytest.RestApi.ApiInterface;
import pharmeasytest.com.pharmeasytest.RestApi.RestApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by amit on 12/01/17.
 */

public class CityFragment extends Fragment {
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    String north = "44.1";
    String south = "9.9";
    String east = "22.4";
    String west = "55.2";
    String lang = "de";
    String username = "demo";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.citylayout, parent, false);
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

        Call<GeoResponse> call = apiService.getGeo(north, south, east, west, lang, username);
        call.enqueue(new Callback<GeoResponse>() {
            @Override
            public void onResponse(Call<GeoResponse> call, Response<GeoResponse> response) {
                List<GeoModel> geoModelList = response.body().getGeoModelList();

                if (geoModelList == null) {

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
                    recyclerView.setAdapter(new GeoAdapter(geoModelList, R.layout.list_item, getActivity()));
                }
            }

            @Override
            public void onFailure(Call<GeoResponse> call, Throwable t) {
            }
        });


    }
}
