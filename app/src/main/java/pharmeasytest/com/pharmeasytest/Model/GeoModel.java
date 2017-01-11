package pharmeasytest.com.pharmeasytest.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amit on 11/01/17.
 */

public class GeoModel {

    @SerializedName("lng")
    private String longitude;
    @SerializedName("geonameId")
    private String geoNameId;
    @SerializedName("countrycode")
    private String countryCode;
    @SerializedName("name")
    private String name;
    @SerializedName("fclName")
    private String fclName;
    @SerializedName("toponymName")
    private String toponyName;
    @SerializedName("fcodeName")
    private String fCodeName;
    @SerializedName("wikipedia")
    private String wikepedia;
    @SerializedName("lat")
    private String latitude;
    @SerializedName("fcl")
    private String fcl;
    @SerializedName("population")
    private String population;
    @SerializedName("fcode")
    private String fCode;


    public GeoModel(String longitude, String geoNameId, String countryCode, String fclName, String name, String toponyName, String wikepedia, String fCodeName, String latitude, String population, String fcl, String fCode) {
        this.longitude = longitude;
        this.geoNameId = geoNameId;
        this.countryCode = countryCode;
        this.fclName = fclName;
        this.name = name;
        this.toponyName = toponyName;
        this.wikepedia = wikepedia;
        this.fCodeName = fCodeName;
        this.latitude = latitude;
        this.population = population;
        this.fcl = fcl;
        this.fCode = fCode;
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getGeoNameId() {
        return geoNameId;
    }

    public void setGeoNameId(String geoNameId) {
        this.geoNameId = geoNameId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFclName() {
        return fclName;
    }

    public void setFclName(String fclName) {
        this.fclName = fclName;
    }

    public String getToponyName() {
        return toponyName;
    }

    public void setToponyName(String toponyName) {
        this.toponyName = toponyName;
    }

    public String getfCodeName() {
        return fCodeName;
    }

    public void setfCodeName(String fCodeName) {
        this.fCodeName = fCodeName;
    }

    public String getWikepedia() {
        return wikepedia;
    }

    public void setWikepedia(String wikepedia) {
        this.wikepedia = wikepedia;
    }

    public String getFcl() {
        return fcl;
    }

    public void setFcl(String fcl) {
        this.fcl = fcl;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }


}
