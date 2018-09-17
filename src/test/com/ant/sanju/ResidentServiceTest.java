package test.com.ant.sanju;

import main.com.ant.sanju.ResidentService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lenovo on 17/09/2018.
 */
public class ResidentServiceTest {
    @Test
    public void testResident() {
        ResidentService residentService = new ResidentService();
        Assert.assertNotNull(residentService.getResident());
        Assert.assertEquals(38, residentService.getResident().getAge());
        Assert.assertTrue(residentService.getResident().isMarried());
    }
}
