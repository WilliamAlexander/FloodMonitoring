package eu.fiskur.floodmonitoringapi.alerts;

import com.google.gson.annotations.SerializedName;

public class ForecastRisk {
    public @SerializedName("@id") String id;
    public String advice;
    //dayForecast
    public String impact;
    public String riskLevel;
    public String type;
}
