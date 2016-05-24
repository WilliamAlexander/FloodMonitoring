package eu.fiskur.floodmonitoringapi.stations;

import com.google.gson.annotations.SerializedName;

public class Reading {
    public @SerializedName("@id") String id;
    public String dateTime;
    public String measure;
    public Float value;
}
