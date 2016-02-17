package eu.fiskur.floodmonitoringapi;

import junit.framework.Assert;
import org.junit.Test;

public class LogTests {

  @Test
  public void testLogListener(){
    FloodApiLogger.getInstance().setApiLogListener(new FloodApiLogger.ApiLogListener() {
      @Override public void apiLog(String message) {
        Assert.assertEquals("hello", message);
      }
    });

    FloodApiLogger.getInstance().log("hello");
  }
}
