package eu.fiskur.floodmonitoringapi;

import eu.fiskur.floodmonitoringapi.alerts.FloodAreaExpanded;
import eu.fiskur.floodmonitoringapi.alerts.FloodWarning;
import eu.fiskur.floodmonitoringapi.alerts.ForecastRisk;
import eu.fiskur.floodmonitoringapi.alerts.ThreeDayForecast;
import eu.fiskur.floodmonitoringapi.deserializers.RemedialStringType;
import eu.fiskur.floodmonitoringapi.stations.Measure;

import eu.fiskur.floodmonitoringapi.stations.Reading;
import eu.fiskur.floodmonitoringapi.stations.StageScale;
import eu.fiskur.floodmonitoringapi.stations.StationDetail;
import eu.fiskur.floodmonitoringapi.stations.StationOverview;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

import org.junit.Test;

public class PojoTests {

  @Test
  public void testPojoMeasure(){
    Measure measure = new Measure();
    measure.setId("id");
    measure.setParameter("parameter");
    measure.setParameterName("parameterName");
    measure.setPeriod(1f);
    measure.setQualifier("qualifier");
    measure.setUnitName("unitName");
    measure.setLabel("label");
    Reading reading = new Reading();
    reading.setId("id");
    measure.setLatestReading(reading);
    measure.setNotation("notation");
    measure.setStation("station");
    measure.setStationReference("stationReference");
    measure.setType(new String[] { "type" });
    measure.setValueType("valueType");

    Assert.assertEquals("id", measure.getId());
    Assert.assertEquals("parameter", measure.getParameter());
    Assert.assertEquals("parameterName", measure.getParameterName());
    Assert.assertEquals(1f, measure.getPeriod());
    Assert.assertEquals("qualifier", measure.getQualifier());
    Assert.assertEquals("unitName", measure.getUnitName());
    Assert.assertEquals("label", measure.getLabel());
    Assert.assertEquals("id", measure.getLatestReading().getId());
    Assert.assertEquals("notation", measure.getNotation());
    Assert.assertEquals("station", measure.getStation());
    Assert.assertEquals("stationReference", measure.getStationReference());
    Assert.assertEquals("type", measure.getType()[0]);
    Assert.assertEquals("valueType", measure.getValueType());

    String measureToString = "@id: id\n"
        + "parameter: parameter\n"
        + "parameterName: parameterName\n"
        + "period: 1.0\n"
        + "qualifier: qualifier\n"
        + "unitName: unitName\n";
    Assert.assertEquals(measureToString, measure.toString());

    Assert.assertEquals("", new Measure().toString());

  }

  @Test
  public void testPojoReading(){
    Reading reading = new Reading();
    reading.setId("id");
    reading.setDateTime("dateTime");
    reading.setMeasure("measure");
    reading.setValue(1f);

    Assert.assertEquals("id", reading.getId());
    Assert.assertEquals("dateTime", reading.getDateTime());
    Assert.assertEquals("measure", reading.getMeasure());
    Assert.assertEquals(1f, reading.getValue());

  }

  @Test
  public void testPojoStageScale(){
    StageScale stageScale = new StageScale();
    stageScale.setId("id");
    stageScale.setDatum(1f);

    Reading reading = new Reading();
    reading.setId("id");
    stageScale.setHighestRecent(reading);
    stageScale.setMaxOnRecord(reading);
    stageScale.setMinOnRecord(reading);
    stageScale.setScaleMax(1f);
    stageScale.setTypicalRangeHigh(1f);
    stageScale.setTypicalRangeLow(1f);

    Assert.assertEquals("id", stageScale.getId());
    Assert.assertEquals(1f, stageScale.getDatum());
    Assert.assertEquals("id", stageScale.getHighestRecent().getId());
    Assert.assertEquals("id", stageScale.getMaxOnRecord().getId());
    Assert.assertEquals("id", stageScale.getMinOnRecord().getId());
    Assert.assertEquals(1f, stageScale.getScaleMax());
    Assert.assertEquals(1f, stageScale.getTypicalRangeHigh());
    Assert.assertEquals(1f, stageScale.getTypicalRangeLow());

  }

  @Test
  public void testPojoStationDetail(){
    StationDetail stationDetail = new StationDetail();
    stationDetail.setId("id");
    stationDetail.setRLOIid("RLOIid");
    stationDetail.setCatchmentName("catchmentName");
    stationDetail.setDateOpened("dateOpened");
    stationDetail.setEaAreaName("eaAreaName");
    stationDetail.setEaRegionName("eaRegionName");
    stationDetail.setEasting(1f);
    RemedialStringType remedialString = new RemedialStringType();
    remedialString.setLabel("label");
    stationDetail.setLabel(remedialString);
    stationDetail.setLat(1f);
    stationDetail.setLon(1f);
    Measure measure = new Measure();
    measure.setId("id");
    Measure[] measures = new Measure[]{measure};
    stationDetail.setMeasures(measures);
    stationDetail.setNorthing(1f);
    stationDetail.setNotation("notation");
    stationDetail.setRiverName("riverName");
    StageScale stageScale = new StageScale();
    stageScale.setId("id");
    stationDetail.setStageScale(stageScale);
    stationDetail.setStationReference("stationReference");
    stationDetail.setTown("town");
    stationDetail.setWiskiID("wiskiID");

    Assert.assertEquals("id", stationDetail.getId());
    Assert.assertEquals("RLOIid", stationDetail.getRLOIid());
    Assert.assertEquals("catchmentName", stationDetail.getCatchmentName());
    Assert.assertEquals("dateOpened", stationDetail.getDateOpened());
    Assert.assertEquals("eaAreaName", stationDetail.getEaAreaName());
    Assert.assertEquals("eaRegionName", stationDetail.getEaRegionName());
    Assert.assertEquals(1f, stationDetail.getEasting());
    Assert.assertEquals("label", stationDetail.getLabel().getLabel());
    Assert.assertEquals(1f, stationDetail.getLat());
    Assert.assertEquals(1f, stationDetail.getLon());
    Assert.assertEquals("id", stationDetail.getMeasures()[0].getId());
    Assert.assertEquals(1f, stationDetail.getNorthing());
    Assert.assertEquals("notation", stationDetail.getNotation());
    Assert.assertEquals("riverName", stationDetail.getRiverName());
    Assert.assertEquals("id", stationDetail.getStageScale().getId());
    Assert.assertEquals("stationReference", stationDetail.getStationReference());
    Assert.assertEquals("town", stationDetail.getTown());
    Assert.assertEquals("wiskiID", stationDetail.getWiskiID());

  }

  @Test
  public void testPojoStationOverview(){
    StationOverview stationOverview = new StationOverview();
    stationOverview.setId("id");
    stationOverview.setRLOIid("RLOIid");
    stationOverview.setCatchmentName("catchmentName");
    stationOverview.setDateOpened("dateOpened");
    stationOverview.setDatumOffset(1f);
    stationOverview.setEee(1);
    RemedialStringType remedialString = new RemedialStringType();
    remedialString.setLabel("label");
    stationOverview.setLabel(remedialString);
    Measure measure = new Measure();
    measure.setId("id");
    List<Measure> measures = new ArrayList<>();
    measures.add(measure);
    stationOverview.setMeasures(measures);
    stationOverview.setNnn(1);
    stationOverview.setNotation("notation");
    stationOverview.setRiverName("riverName");
    stationOverview.setStageScale("stageScale");
    stationOverview.setStationReference("stationReference");
    stationOverview.setTown("town");
    stationOverview.setWiskiID("wiskiID");

    Assert.assertEquals("id", stationOverview.getId());
    Assert.assertEquals("RLOIid", stationOverview.getRLOIid());
    Assert.assertEquals("catchmentName", stationOverview.getCatchmentName());
    Assert.assertEquals("dateOpened", stationOverview.getDateOpened());
    Assert.assertEquals(1f, stationOverview.getDatumOffset());
    Assert.assertEquals(1, stationOverview.getEee().intValue());
    Assert.assertEquals("label", stationOverview.getLabel().getLabel());
    Assert.assertEquals("id", stationOverview.getMeasures().get(0).getId());
    Assert.assertEquals(1, stationOverview.getNnn().intValue());
    Assert.assertEquals("notation", stationOverview.getNotation());
    Assert.assertEquals("riverName", stationOverview.getRiverName());
    Assert.assertEquals("stageScale", stationOverview.getStageScale());
    Assert.assertEquals("stationReference", stationOverview.getStationReference());
    Assert.assertEquals("town", stationOverview.getTown());
    Assert.assertEquals("wiskiID", stationOverview.getWiskiID());

    String stationOverviewToString = "@id: id\n"
        + "RLOIid: RLOIid\n"
        + "catchmentName: catchmentName\n"
        + "dateOpened: dateOpened\n"
        + "eee: 1\n"
        + "label: label\n"
        + "@id: id\n"
        + "\n"
        + "nnn: 1\n"
        + "notation: notation\n"
        + "riverName: riverName\n"
        + "stageScale: stageScale\n"
        + "stationReference: stationReference\n"
        + "town: town\n"
        + "wiskiID: wiskiID\n";
    Assert.assertEquals(stationOverviewToString, stationOverview.toString());

    Assert.assertEquals("", new StationOverview().toString());

  }

  @Test
  public void testPojoFloodAreaExpanded(){
    FloodAreaExpanded floodAreaExpanded = new FloodAreaExpanded();
    floodAreaExpanded.setId("id");
    floodAreaExpanded.setCurrentWarning("currentWarning");
    floodAreaExpanded.setDescription("description");
    floodAreaExpanded.setEaAreaName("eaAreaName");
    floodAreaExpanded.setEaRegionName("eaRegionName");
    floodAreaExpanded.setFwdCode("fwdCode");
    floodAreaExpanded.setLabel("label");
    floodAreaExpanded.setLat(1f);
    floodAreaExpanded.setLon(1f);
    floodAreaExpanded.setNotation("notation");
    floodAreaExpanded.setPolygon("polygon");
    floodAreaExpanded.setQuickDialNumber("quickDialNumber");
    floodAreaExpanded.setRiverOrSea("riverOrSea");
    floodAreaExpanded.setType(new String[] { "type" });
    floodAreaExpanded.setCounty("county");

    Assert.assertEquals("id", floodAreaExpanded.getId());
    Assert.assertEquals("currentWarning", floodAreaExpanded.getCurrentWarning());
    Assert.assertEquals("description", floodAreaExpanded.getDescription());
    Assert.assertEquals("eaAreaName", floodAreaExpanded.getEaAreaName());
    Assert.assertEquals("eaRegionName", floodAreaExpanded.getEaRegionName());
    Assert.assertEquals("fwdCode", floodAreaExpanded.getFwdCode());
    Assert.assertEquals("label", floodAreaExpanded.getLabel());
    Assert.assertEquals(1f, floodAreaExpanded.getLat());
    Assert.assertEquals(1f, floodAreaExpanded.getLon());
    Assert.assertEquals("notation", floodAreaExpanded.getNotation());
    Assert.assertEquals("polygon", floodAreaExpanded.getPolygon());
    Assert.assertEquals("quickDialNumber", floodAreaExpanded.getQuickDialNumber());
    Assert.assertEquals("riverOrSea", floodAreaExpanded.getRiverOrSea());
    Assert.assertEquals("type", floodAreaExpanded.getType()[0]);
    Assert.assertEquals("county", floodAreaExpanded.getCounty());

  }

  @Test
  public void testPojoFloodWarning(){
    FloodWarning floodWarning = new FloodWarning();
    floodWarning.setId("id");
    floodWarning.setDescription("description");
    floodWarning.setEaAreaName("eaAreaName");
    floodWarning.setEaRegionName("eaRegionName");
    FloodAreaExpanded floodAreaExpanded = new FloodAreaExpanded();
    floodAreaExpanded.setId("id");
    floodWarning.setFloodArea(floodAreaExpanded);
    floodWarning.setFloodAreaID("floodAreaID");
    floodWarning.setIsTidal(true);
    floodWarning.setLcounty("lcounty");
    floodWarning.setMessage("message");
    floodWarning.setSeverity("severity");
    floodWarning.setSeverityLevel(1);
    floodWarning.setTimeMessageChanged("timeMessageChanged");
    floodWarning.setTimeRaised("timeRaised");
    floodWarning.setTimeSeverityChanged("timeSeverityChanged");
    floodWarning.setIsHeader(Boolean.TRUE, "headerLabel");
    floodWarning.setHeaderLabel("headerLabel");

    Assert.assertEquals("id", floodWarning.getId());
    Assert.assertEquals("description", floodWarning.getDescription());
    Assert.assertEquals("eaAreaName", floodWarning.getEaAreaName());
    Assert.assertEquals("eaRegionName", floodWarning.getEaRegionName());
    Assert.assertEquals("id", floodWarning.getFloodArea().getId());
    Assert.assertEquals("floodAreaID", floodWarning.getFloodAreaID());
    Assert.assertTrue(floodWarning.getIsTidal());
    Assert.assertEquals("lcounty", floodWarning.getLcounty());
    Assert.assertEquals("message", floodWarning.getMessage());
    Assert.assertEquals("severity", floodWarning.getSeverity());
    Assert.assertEquals(1, floodWarning.getSeverityLevel().intValue());
    Assert.assertEquals("timeMessageChanged", floodWarning.getTimeMessageChanged());
    Assert.assertEquals("timeRaised", floodWarning.getTimeRaised());
    Assert.assertEquals("timeSeverityChanged", floodWarning.getTimeSeverityChanged());
    Assert.assertTrue(floodWarning.isHeader());
    Assert.assertEquals("headerLabel", floodWarning.getHeaderLabel());

    //Comparitor:
    FloodWarning another = new FloodWarning();
    another.setSeverityLevel(3);
    Assert.assertEquals(-2, floodWarning.compareTo(another));
    Assert.assertEquals(-2, FloodWarning.WarningItemComparator.compare(floodWarning, another));

  }

  @Test
  public void testPojoForecastRisk(){
    ForecastRisk forecastRisk = new ForecastRisk();
    forecastRisk.setId("id");
    forecastRisk.setAdvice("advice");
    forecastRisk.setImpact("impact");
    forecastRisk.setRiskLevel("riskLevel");
    forecastRisk.setType("type");

    Assert.assertEquals("id", forecastRisk.getId());
    Assert.assertEquals("advice", forecastRisk.getAdvice());
    Assert.assertEquals("impact", forecastRisk.getImpact());
    Assert.assertEquals("riskLevel", forecastRisk.getRiskLevel());
    Assert.assertEquals("type", forecastRisk.getType());

  }

  @Test
  public void testPojoThreeDayForecast(){
    ThreeDayForecast threeDayForecast = new ThreeDayForecast();
    threeDayForecast.setId("id");
    threeDayForecast.setDay1image("day1image");
    threeDayForecast.setDay2image("day2image");
    threeDayForecast.setDay3image("day3image");
    threeDayForecast.setForecastSummary("forecastSummary");
    threeDayForecast.setForecastSummaryWelsh("forecastSummaryWelsh");
    threeDayForecast.setIssueDatetime("issueDatetime");
    threeDayForecast.setLabel("label");
    threeDayForecast.setType("type");
    ForecastRisk risk = new ForecastRisk();
    risk.setId("id");
    List<ForecastRisk> forecastRisks = new ArrayList<>();
    forecastRisks.add(risk);
    threeDayForecast.setForecastRisk(forecastRisks);

    Assert.assertEquals("id", threeDayForecast.getId());
    Assert.assertEquals("day1image", threeDayForecast.getDay1image());
    Assert.assertEquals("day2image", threeDayForecast.getDay2image());
    Assert.assertEquals("day3image", threeDayForecast.getDay3image());
    Assert.assertEquals("forecastSummary", threeDayForecast.getForecastSummary());
    Assert.assertEquals("forecastSummaryWelsh", threeDayForecast.getForecastSummaryWelsh());
    Assert.assertEquals("issueDatetime", threeDayForecast.getIssueDatetime());
    Assert.assertEquals("label", threeDayForecast.getLabel());
    Assert.assertEquals("type", threeDayForecast.getType());
    Assert.assertEquals("id", threeDayForecast.getForecastRisk().get(0).getId());

    String forecastToString = "@id: id\n"
        + "forecastSummary: forecastSummary\n"
        + "issueDatetime: issueDatetime\n"
        + "type: type\n";
    Assert.assertEquals(forecastToString, threeDayForecast.toString());
    Assert.assertEquals("", new ThreeDayForecast().toString());
  }
}
