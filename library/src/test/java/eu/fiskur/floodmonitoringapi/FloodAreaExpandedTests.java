package eu.fiskur.floodmonitoringapi;

import com.google.gson.Gson;

import junit.framework.Assert;

import org.junit.Test;
import eu.fiskur.floodmonitoringapi.alerts.FloodAreaExpanded;

public class FloodAreaExpandedTests {

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

    @Test
    public void testFloodAreaExpanded(){
        Gson gson = GSONProvider.getRestGson();
        FloodAreaExpanded floodAreaExpanded = gson.fromJson(FLOOD_AREA_EXPANDED, FloodAreaExpanded.class);

        Assert.assertEquals("Shropshire", floodAreaExpanded.county);
        Assert.assertEquals("http://environment.data.gov.uk/flood-monitoring/id/floods/93474", floodAreaExpanded.currentWarning);
        Assert.assertEquals("Severn Vyrnwy Confluence", floodAreaExpanded.description);
        Assert.assertEquals("West", floodAreaExpanded.eaAreaName);
        Assert.assertEquals("Midlands Region", floodAreaExpanded.eaRegionName);
        Assert.assertEquals("031WAF114", floodAreaExpanded.fwdCode);
        Assert.assertEquals("http://environment.data.gov.uk/flood-monitoring/id/floodAreas/031WAF114", floodAreaExpanded.id);
        Assert.assertEquals("Severn Vyrnwy Confluence", floodAreaExpanded.label);
        Assert.assertEquals("031WAF114", floodAreaExpanded.notation);
        Assert.assertEquals("http://environment.data.gov.uk/flood-monitoring/id/floodAreas/031WAF114/polygon", floodAreaExpanded.polygon);
        Assert.assertEquals("Severn Vyrnwy Confluence", floodAreaExpanded.description);
        Assert.assertEquals("052317", floodAreaExpanded.quickDialNumber);
        Assert.assertEquals("River Severn, River Vyrnwy", floodAreaExpanded.riverOrSea);
        Assert.assertEquals(52.765503f, floodAreaExpanded.lat);
        Assert.assertEquals(-2.9931457f, floodAreaExpanded.lon);
    }
}
