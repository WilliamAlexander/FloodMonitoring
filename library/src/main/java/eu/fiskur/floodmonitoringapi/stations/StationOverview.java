package eu.fiskur.floodmonitoringapi.stations;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import eu.fiskur.floodmonitoringapi.deserializers.RemedialStringType;

public class StationOverview {
    public @SerializedName("@id") String id;
    public String RLOIid;
    public String catchmentName;
    public String dateOpened;
    public Float datumOffset;
    public Integer eee;
    public RemedialStringType label;//This field can be either a string or string[]
    public List<Measure> measures;
    public Integer nnn;
    public String notation;
    public String riverName;
    public String stageScale;
    public String stationReference;
    public String town;
    public String wiskiID;

    @Override
    public String toString() {
        return stationReference;
    }
}
