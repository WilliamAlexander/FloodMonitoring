package eu.fiskur.floodmonitoringapi.alerts;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThreeDayForecast {
    public @SerializedName("@id") String id;
    public String day1image;
    public String day2image;
    public String day3image;
    public List<ForecastRisk> forecastRisk;
    public String forecastSummary;
    public String forecastSummaryWelsh;
    public String issueDatetime;
    public String label;
    public String type;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if(id != null){
            sb.append("@id: " + id + "\n");
        }
        if(forecastSummary != null){
            sb.append("forecastSummary: " + forecastSummary + "\n");
        }
        if(issueDatetime != null){
            sb.append("issueDatetime: " + issueDatetime + "\n");
        }
        if(type != null){
            sb.append("type: " + type + "\n");
        }
        return sb.toString();
    }
}
