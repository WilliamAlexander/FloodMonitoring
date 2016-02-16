package eu.fiskur.floodmonitoringapi;

import junit.framework.Assert;

import org.junit.Test;

import eu.fiskur.floodmonitoringapi.alerts.ThreeDayForecast;

public class ThreeDayForecastTests {

    @Test
    public void testSetters(){
        ThreeDayForecast forecast = new ThreeDayForecast();
        forecast.setType("type");
        forecast.setId("id");
        forecast.setDay1image("image_1");
        forecast.setDay2image("image_2");
        forecast.setDay3image("image_3");
        forecast.setForecastSummary("summary");
        forecast.setForecastSummaryWelsh("summary_welsh");
        forecast.setIssueDatetime("issue_date_time");
        forecast.setLabel("label");

        Assert.assertEquals("type", forecast.getType());
        Assert.assertEquals("id", forecast.getId());
        Assert.assertEquals("image_1", forecast.getDay1image());
        Assert.assertEquals("image_2", forecast.getDay2image());
        Assert.assertEquals("image_3", forecast.getDay3image());
        Assert.assertEquals("summary", forecast.getForecastSummary());
        Assert.assertEquals("summary_welsh", forecast.getForecastSummaryWelsh());
        Assert.assertEquals("issue_date_time", forecast.getIssueDatetime());
        Assert.assertEquals("label", forecast.getLabel());
    }
}
