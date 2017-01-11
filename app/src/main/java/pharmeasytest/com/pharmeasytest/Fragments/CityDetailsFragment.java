package pharmeasytest.com.pharmeasytest.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import pharmeasytest.com.pharmeasytest.Model.GeoModel;
import pharmeasytest.com.pharmeasytest.R;

/**
 * Created by amit on 12/01/17.
 */

public class CityDetailsFragment extends Fragment {

    @Bind(R.id.cityName)
    TextView cityNameTv;

    @Bind(R.id.longitude)
    TextView longitudeTv;

    @Bind(R.id.geoNameId)
    TextView getNameIdTv;

    @Bind(R.id.countryCode)
    TextView countryCodeTv;

    @Bind(R.id.fclName)
    TextView fclNameTv;

    @Bind(R.id.toponyName)
    TextView toponyNameTv;

    @Bind(R.id.fCodeName)
    TextView fCodeNameTv;

    @Bind(R.id.wikepedia)
    TextView wikepediaTv;

    @Bind(R.id.latitude)
    TextView latitudeTv;

    @Bind(R.id.fcl)
    TextView fclTv;

    @Bind(R.id.population)
    TextView populationTv;

    @Bind(R.id.fCode)
    TextView gCodeTv;

    GeoModel geoModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.citydetails, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        cityNameTv.setText("City : " + geoModel.getName());
        longitudeTv.setText("Longitude : " + geoModel.getLongitude());
        getNameIdTv.setText("GeoNameID : " + geoModel.getGeoNameId());
        countryCodeTv.setText("CountryCode : " + geoModel.getCountryCode());
        fclNameTv.setText("FclName : " + geoModel.getFclName());
        toponyNameTv.setText("ToponyName : " + geoModel.getToponyName());
        fCodeNameTv.setText("FCodeName : " + geoModel.getfCodeName());
        wikepediaTv.setText("Wikepedia : " + geoModel.getWikepedia());
        latitudeTv.setText("Latitude : " + geoModel.getLatitude());
        fclTv.setText("Fcl : " + geoModel.getFcl());
        populationTv.setText("Population : " + geoModel.getPopulation());
        gCodeTv.setText("FCode : " + geoModel.getfCode());


    }


    public void setGeoModel(GeoModel geoModel) {
        this.geoModel = geoModel;
    }

}
