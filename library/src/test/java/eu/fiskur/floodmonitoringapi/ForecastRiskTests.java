package eu.fiskur.floodmonitoringapi;

import junit.framework.Assert;

import org.junit.Test;

import eu.fiskur.floodmonitoringapi.alerts.ForecastRisk;

public class ForecastRiskTests {

    @Test
    public void testSetters(){
        ForecastRisk risk = new ForecastRisk();
        risk.setAdvice("advice");
        risk.setId("id");
        risk.setImpact("impact");
        risk.setRiskLevel("risk_level");
        risk.setType("type");

        Assert.assertEquals("advice", risk.getAdvice());
        Assert.assertEquals("id", risk.getId());
        Assert.assertEquals("impact", risk.getImpact());
        Assert.assertEquals("risk_level", risk.getRiskLevel());
        Assert.assertEquals("type", risk.getType());
    }
}
