package pharmeasytest.com.pharmeasytest.Adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import pharmeasytest.com.pharmeasytest.Fragments.CityDetailsFragment;
import pharmeasytest.com.pharmeasytest.Model.GeoModel;
import pharmeasytest.com.pharmeasytest.R;

/**
 * Created by amit on 11/01/17.
 */

public class GeoAdapter extends RecyclerView.Adapter<GeoAdapter.ViewHolder> {

    private int rowLayout;
    List<GeoModel> geoModelList;
    FragmentActivity activity;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.cityName)
        TextView cityName;
        @Bind(R.id.cityLayout)
        RelativeLayout cityLayout;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }

    }

    public GeoAdapter(List<GeoModel> geoModelList, int rowLayout, FragmentActivity activity) {
        this.geoModelList = geoModelList;
        this.rowLayout = rowLayout;
        this.activity = activity;
    }

    @Override
    public GeoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                    int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.cityName.setText(geoModelList.get(position).getName());

        holder.cityLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CityDetailsFragment cityDetailsFragment = new CityDetailsFragment();
                cityDetailsFragment.setGeoModel(geoModelList.get(position));
                activity.getSupportFragmentManager().beginTransaction().
                        replace(R.id.childContent, cityDetailsFragment, "CityDetailsFragmentTag").addToBackStack("CityDetailsFragment").
                        commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return geoModelList.size();
    }


}