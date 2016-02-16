package eu.fiskur.floodmonitoringapi;

import com.google.gson.Gson;

import junit.framework.Assert;

import org.junit.Test;
import eu.fiskur.floodmonitoringapi.alerts.FloodAreaExpanded;

public class FloodAreaExpandedTests {

    @Test
    public void testFloodAreaExpanded(){
        Gson gson = GSONProvider.getRestGson();
        FloodAreaExpanded floodAreaExpanded = gson.fromJson(FLOOD_AREA_EXPANDED, FloodAreaExpanded.class);

        Assert.assertEquals("Shropshire", floodAreaExpanded.getCounty());
        Assert.assertEquals("http://environment.data.gov.uk/flood-monitoring/id/floods/93474", floodAreaExpanded.getCurrentWarning());
        Assert.assertEquals("Severn Vyrnwy Confluence", floodAreaExpanded.getDescription());
        Assert.assertEquals("West", floodAreaExpanded.getEaAreaName());
        Assert.assertEquals("Midlands Region", floodAreaExpanded.getEaRegionName());
        Assert.assertEquals("031WAF114", floodAreaExpanded.getFwdCode());
        Assert.assertEquals("http://environment.data.gov.uk/flood-monitoring/id/floodAreas/031WAF114", floodAreaExpanded.getId());
        Assert.assertEquals("Severn Vyrnwy Confluence", floodAreaExpanded.getLabel());
        Assert.assertEquals("031WAF114", floodAreaExpanded.getNotation());
        Assert.assertEquals("http://environment.data.gov.uk/flood-monitoring/id/floodAreas/031WAF114/polygon", floodAreaExpanded.getPolygon());
        Assert.assertEquals("Severn Vyrnwy Confluence", floodAreaExpanded.getDescription());
        Assert.assertEquals("052317", floodAreaExpanded.getQuickDialNumber());
        Assert.assertEquals("River Severn, River Vyrnwy", floodAreaExpanded.getRiverOrSea());
        Assert.assertEquals(52.765503f, floodAreaExpanded.getLat());
        Assert.assertEquals(-2.9931457f, floodAreaExpanded.getLon());
    }

    @Test
    public void testSetters(){
        FloodAreaExpanded floodAreaExpanded = new FloodAreaExpanded();
        floodAreaExpanded.setCounty("county");
        floodAreaExpanded.setCurrentWarning("current_warning");
        floodAreaExpanded.setDescription("description");
        floodAreaExpanded.setEaAreaName("ea_area_name");
        floodAreaExpanded.setEaRegionName("ea_region_name");
        floodAreaExpanded.setFwdCode("fwd_code");
        floodAreaExpanded.setId("id");
        floodAreaExpanded.setLabel("label");
        floodAreaExpanded.setLat(1f);
        floodAreaExpanded.setLon(2f);
        floodAreaExpanded.setNotation("notation");
        floodAreaExpanded.setPolygon("polygon");
        floodAreaExpanded.setQuickDialNumber("quick_dial_number");
        floodAreaExpanded.setRiverOrSea("river_or_sea");
        floodAreaExpanded.setType(new String[]{"type"});

        Assert.assertEquals("county", floodAreaExpanded.getCounty());
        Assert.assertEquals("current_warning", floodAreaExpanded.getCurrentWarning());
        Assert.assertEquals("description", floodAreaExpanded.getDescription());
        Assert.assertEquals("ea_area_name", floodAreaExpanded.getEaAreaName());
        Assert.assertEquals("ea_region_name", floodAreaExpanded.getEaRegionName());
        Assert.assertEquals("fwd_code", floodAreaExpanded.getFwdCode());
        Assert.assertEquals("id", floodAreaExpanded.getId());
        Assert.assertEquals("label", floodAreaExpanded.getLabel());
        Assert.assertEquals(1f, floodAreaExpanded.getLat());
        Assert.assertEquals(2f, floodAreaExpanded.getLon());
        Assert.assertEquals("notation", floodAreaExpanded.getNotation());
        Assert.assertEquals("polygon", floodAreaExpanded.getPolygon());
        Assert.assertEquals("quick_dial_number", floodAreaExpanded.getQuickDialNumber());
        Assert.assertEquals("river_or_sea", floodAreaExpanded.getRiverOrSea());
        Assert.assertEquals("type", floodAreaExpanded.getType()[0]);
    }

    private static final String FLOOD_AREA_EXPANDED = "{ \n" +
            "      \"@id\" : \"http://environment.data.gov.uk/flood-monitoring/id/floodAreas/031WAF114\" ,\n" +
            "      \"county\" : \"Shropshire\" ,\n" +
            "      \"currentWarning\" : \"http://environment.data.gov.uk/flood-monitoring/id/floods/93474\" ,\n" +
            "      \"description\" : \"Severn Vyrnwy Confluence\" ,\n" +
            "      \"eaAreaName\" : \"West\" ,\n" +
            "      \"eaRegionName\" : \"Midlands Region\" ,\n" +
            "      \"envelope\" : { \n" +
            "        \"lowerCorner\" : { \n" +
            "          \"x\" : 323652.897014925 ,\n" +
            "          \"y\" : 314605\n" +
            "        }\n" +
            "         ,\n" +
            "        \"upperCorner\" : { \n" +
            "          \"x\" : 339397.511940298 ,\n" +
            "          \"y\" : 332658\n" +
            "        }\n" +
            "      }\n" +
            "       ,\n" +
            "      \"fwdCode\" : \"031WAF114\" ,\n" +
            "      \"label\" : \"Severn Vyrnwy Confluence\" ,\n" +
            "      \"lat\" : 52.765501928560823 ,\n" +
            "      \"long\" : -2.99314567228076 ,\n" +
            "      \"notation\" : \"031WAF114\" ,\n" +
            "      \"polygon\" : \"http://environment.data.gov.uk/flood-monitoring/id/floodAreas/031WAF114/polygon\" ,\n" +
            "      \"quickDialNumber\" : \"052317\" ,\n" +
            "      \"quickDialNumberWelsh\" : \"0511436\" ,\n" +
            "      \"riverOrSea\" : \"River Severn, River Vyrnwy\" ,\n" +
            "      \"type\" : [ \"http://environment.data.gov.uk/flood-monitoring/def/core/FloodAlertArea\", \"http://environment.data.gov.uk/flood-monitoring/def/core/FloodArea\" ]\n" +
            "    }";
}
