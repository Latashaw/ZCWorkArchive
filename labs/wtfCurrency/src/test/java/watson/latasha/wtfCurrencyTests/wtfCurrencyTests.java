package watson.latasha.wtfCurrencyTests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import watson.latasha.wtfCurrency.Converter;

/**
 * Created by latashawatson on 1/12/17.
 */
public class wtfCurrencyTests {
    Converter converter;

    @Before
    public void setup(){
        converter = new Converter();
    }

    @Test
    public void convertDollarToEuro(){
       double expected = 47;
       double actual = converter.convertDollarToEuro(50.0);
       assertEquals(expected, actual, 0);
    }


    @Test
    public void convertEuroToDollar(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }


    @Test
    public void convertEuroToBritishPound(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }


    @Test
    public void convertBritishPoundToIndianRupee(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void convertRupeeToCanadianDollar(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void convertCanadianDollarToSingaporeDollar(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void converSingaporeDollarToSwissFranc(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void convertSwissFrancToMalaysianRinggit(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void convertMalaysianRinggitToJapaneseYen(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void convertJapaneseYenToChineseYuanRenminbi(){
        double expected = 53.00;
        double actual = converter.convertEuroToDollar(50.00);
        assertEquals(expected, actual, 0);
    }