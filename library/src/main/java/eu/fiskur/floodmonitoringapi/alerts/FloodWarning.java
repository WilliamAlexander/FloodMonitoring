package eu.fiskur.floodmonitoringapi.alerts;

import android.support.annotation.NonNull;


import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class FloodWarning implements Comparable<FloodWarning>{
    public @SerializedName("@id") String id;
    public String description;
    public String eaAreaName;
    public String eaRegionName;
    public FloodAreaExpanded floodArea;
    public String floodAreaID;
    public Boolean isTidal;
    public String lcounty;
    public String message;
    public String severity;
    public Integer severityLevel;
    public String timeMessageChanged;
    public String timeRaised;
    public String timeSeverityChanged;
    public boolean isHeader = false;
    public String headerLabel;

    public boolean isHeader() {
        return isHeader;
    }

    public void setIsHeader(boolean isHeader, String headerLabel) {
        this.isHeader = isHeader;
        this.headerLabel = headerLabel;
    }

    public String getHeaderLabel() {
        return headerLabel;
    }

    public void setHeaderLabel(String headerLabel) {
        this.headerLabel = headerLabel;
    }

    @Override
    public int compareTo(@NonNull FloodWarning another) {
        return severityLevel - another.severityLevel;
    }

    public static Comparator<FloodWarning> WarningItemComparator = new Comparator<FloodWarning>() {

        public int compare(FloodWarning warning1, FloodWarning warning2) {
            return warning1.compareTo(warning2);
        }

    };

}
