package eu.fiskur.floodmonitoringapi.stations;

import com.google.gson.annotations.SerializedName;

import eu.fiskur.floodmonitoringapi.deserializers.RemedialStringType;

public class StationDetail {
    public @SerializedName("@id") String id;
    public String RLOIid;
    public String catchmentName;
    public String dateOpened;
    public String eaAreaName;
    public String eaRegionName;
    public Float easting;
    public RemedialStringType label;
    public Float lat;
    public @SerializedName("long")Float lon;
    public Measure[] measures;
    public Float northing;
    public String notation;
    public String riverName;
    public StageScale stageScale;
    public String stationReference;
    public String town;
    //RemedialStringType type;
    public String wiskiID;
}
