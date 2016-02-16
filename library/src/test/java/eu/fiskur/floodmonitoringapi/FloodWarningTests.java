package eu.fiskur.floodmonitoringapi;

import junit.framework.Assert;

import org.junit.Test;

import eu.fiskur.floodmonitoringapi.alerts.FloodAreaExpanded;
import eu.fiskur.floodmonitoringapi.alerts.FloodWarning;

public class FloodWarningTests {

    @Test
    public void testSetters(){
        FloodWarning floodWarning = new FloodWarning();
        floodWarning.setDescription("description");
        floodWarning.setEaAreaName("ea_area_name");
        floodWarning.setEaRegionName("ea_region_name");
        FloodAreaExpanded fae = new FloodAreaExpanded();
        fae.setId("id1");
        floodWarning.setFloodArea(fae);
        floodWarning.setFloodAreaID("flood_area_id");
        floodWarning.setHeaderLabel("header_label");
        floodWarning.setIsHeader(true, "is_header_label");
        floodWarning.setIsTidal(true);
        floodWarning.setLcounty("l_county");
        floodWarning.setMessage("message");
        floodWarning.setSeverity("severity");
        floodWarning.setSeverityLevel(123);
        floodWarning.setTimeMessageChanged("time_message_changed");
        floodWarning.setTimeRaised("time_raised");
        floodWarning.setTimeSeverityChanged("time_severity_changed");

        Assert.assertEquals("description", floodWarning.getDescription());
        Assert.assertEquals("ea_area_name", floodWarning.getEaAreaName());
        Assert.assertEquals("ea_region_name", floodWarning.getEaRegionName());
        Assert.assertEquals("id1", floodWarning.getFloodArea().getId());
        Assert.assertEquals("flood_area_id", floodWarning.getFloodAreaID());
        Assert.assertEquals("is_header_label", floodWarning.getHeaderLabel());
        Assert.assertEquals(true, floodWarning.isHeader());
        Assert.assertEquals(true, floodWarning.getIsTidal().booleanValue());
        Assert.assertEquals("l_county", floodWarning.getLcounty());
        Assert.assertEquals("message", floodWarning.getMessage());
        Assert.assertEquals("severity", floodWarning.getSeverity());
        Assert.assertEquals(123, floodWarning.getSeverityLevel().intValue());
        Assert.assertEquals("time_message_changed", floodWarning.getTimeMessageChanged());
        Assert.assertEquals("time_raised", floodWarning.getTimeRaised());
        Assert.assertEquals("time_severity_changed", floodWarning.getTimeSeverityChanged());
    }
}
