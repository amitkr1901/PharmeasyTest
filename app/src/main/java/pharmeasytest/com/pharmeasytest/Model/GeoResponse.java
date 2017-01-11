package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by amit on 12/01/17.
 */

public class GeoResponse {
    public List<GeoModel> getGeoModelList() {
        return geoModelList;
    }

    public void setGeoModelList(List<GeoModel> geoModelList) {
        this.geoModelList = geoModelList;
    }

    @SerializedName("geonames")
    private List<GeoModel> geoModelList;
}
