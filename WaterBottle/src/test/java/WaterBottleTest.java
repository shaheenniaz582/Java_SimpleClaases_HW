import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before

    public void before(){

        bottle = new WaterBottle(100);

    }

    @Test

    public void hasVolume(){

        assertEquals(100, bottle.getVolume());
    }

    @Test

    public void drink(){

        assertEquals(90, bottle.drink());

    }

    @Test

    public void empty(){

        assertEquals(0, bottle.empty());

    }

    public void fill(){

        assertEquals(100,bottle.fill());

    }


}

