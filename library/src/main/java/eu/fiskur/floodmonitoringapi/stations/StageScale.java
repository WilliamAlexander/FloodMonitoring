package eu.fiskur.floodmonitoringapi.stations;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StageScale {
    public @SerializedName("@id") String id;
    public Float datum;
    public Reading highestRecent;
    public Reading maxOnRecord;
    public Reading minOnRecord;
    public Float scaleMax;
    public Float typicalRangeHigh;
    public Float typicalRangeLow;
}
