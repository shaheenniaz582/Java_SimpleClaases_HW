import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer print;

    @Before

    public void before(){

        print = new Printer(10, 9);

    }

    @Test

    public void hasSheetsOfPaper(){

        assertEquals(10, print.getSheetsOfPaper());
    }

    @Test

    public void hasToner(){

        assertEquals(9,print.getTonerVolume());
    }
}
