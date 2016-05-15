
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Андрей on 15.05.2016.
 */
public class ModelTest {
    public static Model model;
    public static final double ACCURACY = 1e-14;
    @Before
    public void bef(){
        model = new Model(1,2,3);
    }

    @Test
    public void testFindHypoteyse() throws Exception {
        double res = model.findHypoteyse(1,2);
        Assert.assertTrue(res == 2.23606797749979);
    }

    @Test
    public void testFindHeight() throws Exception {
        double res = model.findHeight(1,2,2.23606797749979);
        Assert.assertTrue(res == 0.8944271909999159);

    }

    @Test
    public void checkExistTriange(){
        boolean res = model.checkExistTriangle(7,2,3);
        assertTrue(res == false);
        res = model.checkExistTriangle(1,2,3);
        assertTrue(res == false);
        res = model.checkExistTriangle(4,4,4);
        assertTrue(res == true);
        res = model.checkExistTriangle(100,110,120);
        assertTrue(res == true);
    }
}