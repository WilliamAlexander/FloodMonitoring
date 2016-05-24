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
        StringBuffer sb = new StringBuffer();
        if(id != null){
            sb.append("@id: " + id + "\n");
        }
        if(RLOIid != null){
            sb.append("RLOIid: " + RLOIid + "\n");
        }
        if(catchmentName != null){
            sb.append("catchmentName: " + catchmentName + "\n");
        }
        if(dateOpened != null){
            sb.append("dateOpened: " + dateOpened + "\n");
        }
        if(eee != null){
            sb.append("eee: " + eee + "\n");
        }
        if(label != null){
            sb.append("label: " + label.toString() + "\n");
        }
        if(measures != null){
            //todo
            for(Measure measure : measures){
                sb.append(measure.toString() + "\n");
            }
        }
        if(nnn != null){
            sb.append("nnn: " + nnn + "\n");
        }
        if(notation != null){
            sb.append("notation: " + notation + "\n");
        }
        if(riverName != null){
            sb.append("riverName: " + riverName + "\n");
        }
        if(stageScale != null){
            sb.append("stageScale: " + stageScale + "\n");
        }
        if(stationReference != null){
            sb.append("stationReference: " + stationReference + "\n");
        }
        if(town != null){
            sb.append("town: " + town + "\n");
        }
        if(wiskiID != null){
            sb.append("wiskiID: " + wiskiID + "\n");
        }
        return sb.toString();
    }
}
