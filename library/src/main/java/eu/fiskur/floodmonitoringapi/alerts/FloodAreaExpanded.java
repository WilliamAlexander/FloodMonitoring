package eu.fiskur.floodmonitoringapi.alerts;

import com.google.gson.annotations.SerializedName;

public class FloodAreaExpanded {
    public @SerializedName("@id") String id;
    public String county;
    public String currentWarning;
    public String description;
    public String eaAreaName;
    public String eaRegionName;
    //envelope
    public String fwdCode;
    public String label;
    public Float lat;
    public @SerializedName("long")Float lon;
    public String notation;
    public String polygon;
    public String quickDialNumber;
    public String riverOrSea;
    public String[] type;
}


/*
{
  "@context": "http://environment.data.gov.uk/flood-monitoring/meta/context.jsonld",
  "meta": {
    "publisher": "Environment Agency",
    "licence": "http://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/",
    "documentation": "http://environment.data.gov.uk/flood-monitoring/doc/reference",
    "version": "0.5",
    "comment": "Status: Beta service",
    "hasFormat": [
      "http://environment.data.gov.uk/flood-monitoring/id/floodAreas/013WAFUI.rdf",
      "http://environment.data.gov.uk/flood-monitoring/id/floodAreas/013WAFUI.ttl"
    ]
  },
  "items": {
    "@id": "http://environment.data.gov.uk/flood-monitoring/id/floodAreas/013WAFUI",
    "county": "Greater Manchester and Derbyshire",
    "currentWarning": {
      "@id": "http://environment.data.gov.uk/flood-monitoring/id/floods/93010",
      "description": "Upper River Irwell catchment with Oldham, Bolton, Rochdale, Haslingden, Ramsbottom and Rawtenstall.",
      "eaAreaName": "South",
      "eaRegionName": "North West",
      "floodArea": "http://environment.data.gov.uk/flood-monitoring/id/floodAreas/013WAFUI",
      "floodAreaID": "013WAFUI",
      "isTidal": false,
      "message": "River levels are falling and the situation in the area is now improving. \nFurther showers are expected during the night tonight. Duty officers are continuing to monitor the situation and further information will follow in due course if required.",
      "severity": "Warning no longer in force",
      "severityLevel": 4,
      "timeMessageChanged": "2015-11-09T20:04:00",
      "timeRaised": "2015-11-09T20:04:00",
      "timeSeverityChanged": "2015-11-09T20:04:00",
      "type": "http://environment.data.gov.uk/flood-monitoring/def/core/FloodAlertOrWarning"
    },
    "description": "The Upper Irwell catchment includes the Rivers Beal, Roch and Croal, Limey Water and their tributaries.  Other locations which may be affected are around Farnworth, Whitefield, Little Lever, Radcliffe, Bury, Heywood, Whitworth and Bacup",
    "eaAreaName": "South",
    "eaRegionName": "North West Region",
    "envelope": {
      "lowerCorner": {
        "x": 363868.309950249,
        "y": 405542.013432836
      },
      "upperCorner": {
        "x": 395054.670149254,
        "y": 428269.708955224
      }
    },
    "fwdCode": "013WAFUI",
    "label": "Upper River Irwell catchment with Oldham, Bolton, Rochdale, Haslingden, Ramsbottom and Rawtenstall.",
    "lat": 53.614765880652136,
    "long": -2.303893316563973,
    "notation": "013WAFUI",
    "polygon": "http://environment.data.gov.uk/flood-monitoring/id/floodAreas/013WAFUI/polygon",
    "quickDialNumber": "143002",
    "riverOrSea": "Upper River Irwel",
    "type": [
      "http://environment.data.gov.uk/flood-monitoring/def/core/FloodAlertArea",
      "http://environment.data.gov.uk/flood-monitoring/def/core/FloodArea"
    ]
  }
}
 */
