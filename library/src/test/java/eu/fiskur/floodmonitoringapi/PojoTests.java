package eu.fiskur.floodmonitoringapi;

import eu.fiskur.floodmonitoringapi.alerts.FloodAreaExpanded;
import eu.fiskur.floodmonitoringapi.alerts.FloodWarning;
import eu.fiskur.floodmonitoringapi.alerts.ForecastRisk;
import eu.fiskur.floodmonitoringapi.alerts.ThreeDayForecast;
import eu.fiskur.floodmonitoringapi.stations.Measure;

import eu.fiskur.floodmonitoringapi.stations.Reading;
import eu.fiskur.floodmonitoringapi.stations.StageScale;
import eu.fiskur.floodmonitoringapi.stations.StationDetail;
import eu.fiskur.floodmonitoringapi.stations.StationOverview;
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
    //Unknown type: Reading measure.setLatestReading(...);
    measure.setNotation("notation");
    measure.setStation("station");
    measure.setStationReference("stationReference");
    //Unknown type: String[] measure.setType(...);
    measure.setValueType("valueType");

    Assert.assertEquals("id", measure.getId());
    Assert.assertEquals("parameter", measure.getParameter());
    Assert.assertEquals("parameterName", measure.getParameterName());
    Assert.assertEquals(1f, measure.getPeriod());
    Assert.assertEquals("qualifier", measure.getQualifier());
    Assert.assertEquals("unitName", measure.getUnitName());
    Assert.assertEquals("label", measure.getLabel());
    //Unknown type: Reading measure.getLatestReading();
    Assert.assertEquals("notation", measure.getNotation());
    Assert.assertEquals("station", measure.getStation());
    Assert.assertEquals("stationReference", measure.getStationReference());
    //Unknown type: String[] measure.getType();
    Assert.assertEquals("valueType", measure.getValueType());

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
    //Unknown type: Reading stageScale.setHighestRecent(...);
    //Unknown type: Reading stageScale.setMaxOnRecord(...);
    //Unknown type: Reading stageScale.setMinOnRecord(...);
    stageScale.setScaleMax(1f);
    stageScale.setTypicalRangeHigh(1f);
    stageScale.setTypicalRangeLow(1f);

    Assert.assertEquals("id", stageScale.getId());
    Assert.assertEquals(1f, stageScale.getDatum());
    //Unknown type: Reading stageScale.getHighestRecent();
    //Unknown type: Reading stageScale.getMaxOnRecord();
    //Unknown type: Reading stageScale.getMinOnRecord();
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
    //Unknown type: RemedialStringType stationDetail.setLabel(...);
    stationDetail.setLat(1f);
    stationDetail.setLon(1f);
    //Unknown type: Measure[] stationDetail.setMeasures(...);
    stationDetail.setNorthing(1f);
    stationDetail.setNotation("notation");
    stationDetail.setRiverName("riverName");
    //Unknown type: StageScale stationDetail.setStageScale(...);
    stationDetail.setStationReference("stationReference");
    stationDetail.setTown("town");
    //Unknown type: RemedialStringType stationDetail.setType(...);
    stationDetail.setWiskiID("wiskiID");

    Assert.assertEquals("id", stationDetail.getId());
    Assert.assertEquals("RLOIid", stationDetail.getRLOIid());
    Assert.assertEquals("catchmentName", stationDetail.getCatchmentName());
    Assert.assertEquals("dateOpened", stationDetail.getDateOpened());
    Assert.assertEquals("eaAreaName", stationDetail.getEaAreaName());
    Assert.assertEquals("eaRegionName", stationDetail.getEaRegionName());
    Assert.assertEquals(1f, stationDetail.getEasting());
    //Unknown type: RemedialStringType stationDetail.getLabel();
    Assert.assertEquals(1f, stationDetail.getLat());
    Assert.assertEquals(1f, stationDetail.getLon());
    //Unknown type: Measure[] stationDetail.getMeasures();
    Assert.assertEquals(1f, stationDetail.getNorthing());
    Assert.assertEquals("notation", stationDetail.getNotation());
    Assert.assertEquals("riverName", stationDetail.getRiverName());
    //Unknown type: StageScale stationDetail.getStageScale();
    Assert.assertEquals("stationReference", stationDetail.getStationReference());
    Assert.assertEquals("town", stationDetail.getTown());
    //Unknown type: RemedialStringType stationDetail.getType();
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
    //Unknown type: RemedialStringType stationOverview.setLabel(...);
    //Unknown type: List<Measure> stationOverview.setMeasures(...);
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
    //Unknown type: RemedialStringType stationOverview.getLabel();
    //Unknown type: List<Measure> stationOverview.getMeasures();
    Assert.assertEquals(1, stationOverview.getNnn().intValue());
    Assert.assertEquals("notation", stationOverview.getNotation());
    Assert.assertEquals("riverName", stationOverview.getRiverName());
    Assert.assertEquals("stageScale", stationOverview.getStageScale());
    Assert.assertEquals("stationReference", stationOverview.getStationReference());
    Assert.assertEquals("town", stationOverview.getTown());
    Assert.assertEquals("wiskiID", stationOverview.getWiskiID());

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
    //Unknown type: String[] floodAreaExpanded.setType(...);
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
    //Unknown type: String[] floodAreaExpanded.getType();
    Assert.assertEquals("county", floodAreaExpanded.getCounty());

  }

  @Test
  public void testPojoFloodWarning(){
    FloodWarning floodWarning = new FloodWarning();
    floodWarning.setId("id");
    floodWarning.setDescription("description");
    floodWarning.setEaAreaName("eaAreaName");
    floodWarning.setEaRegionName("eaRegionName");
    //Unknown type: FloodAreaExpanded floodWarning.setFloodArea(...);
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
    //Unknown type: FloodAreaExpanded floodWarning.getFloodArea();
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
    //Unknown type: List<ForecastRisk> threeDayForecast.setForecastRisk(...);

    Assert.assertEquals("id", threeDayForecast.getId());
    Assert.assertEquals("day1image", threeDayForecast.getDay1image());
    Assert.assertEquals("day2image", threeDayForecast.getDay2image());
    Assert.assertEquals("day3image", threeDayForecast.getDay3image());
    Assert.assertEquals("forecastSummary", threeDayForecast.getForecastSummary());
    Assert.assertEquals("forecastSummaryWelsh", threeDayForecast.getForecastSummaryWelsh());
    Assert.assertEquals("issueDatetime", threeDayForecast.getIssueDatetime());
    Assert.assertEquals("label", threeDayForecast.getLabel());
    Assert.assertEquals("type", threeDayForecast.getType());
    //Unknown type: List<ForecastRisk> threeDayForecast.getForecastRisk();

  }
}
