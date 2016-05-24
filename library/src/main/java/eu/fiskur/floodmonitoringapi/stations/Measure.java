package eu.fiskur.floodmonitoringapi.stations;

import com.google.gson.annotations.SerializedName;

public class Measure {
    public @SerializedName("@id") String id;
    public String label;
    public Reading latestReading;
    public String notation;
    public String parameter;
    public String parameterName;
    public Float period;
    public String qualifier;
    public String station;
    public String stationReference;
    public String[] type;
    public String unitName;
    public String valueType;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (id != null) {
            sb.append("@id: " + id + "\n");
        }
        if (parameter != null) {
            sb.append("parameter: " + parameter + "\n");
        }
        if (parameterName != null) {
            sb.append("parameterName: " + parameterName + "\n");
        }
        if (period != null) {
            sb.append("period: " + period + "\n");
        }
        if (qualifier != null) {
            sb.append("qualifier: " + qualifier + "\n");
        }
        if (unitName != null) {
            sb.append("unitName: " + unitName + "\n");
        }

        return sb.toString();
    }

    /*
    Latest reading - sometimes a string sometimes:
    "latestReading": {
        "@id": "http://environment.data.gov.uk/flood-monitoring/data/readings/720215-level-stage-i-15_min-m/2015-11-20T04-30-00Z",
        "date": "2015-11-20",
        "dateTime": "2015-11-20T04:30:00Z",
        "measure": "http://environment.data.gov.uk/flood-monitoring/id/measures/720215-level-stage-i-15_min-m",
        "value": 0.455
      },

      other times:

       "latestReading": "http://environment.data.gov.uk/flood-monitoring/data/readings/690138-level-stage-i-15_min----/2015-07-02T10-15-00Z",

     */
}
