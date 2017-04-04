import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by latashawatson on 2/8/17.
 */
public class InfoManagerTest {
    InfoManager infoManager;
    DriversLicense driversLicense;
    Field[] fields;


    @Before
    public void setup() {
        infoManager = new InfoManager();
        driversLicense = new DriversLicense("latasha", "W083", "06/01/1987", "04/04/04", "08/08/18", "21 Dekalb ave. Manchester, VT 07493", "female", "5-5", "Brown");
        fields = driversLicense.getClass().getDeclaredFields();
    }


    @Test
    public void serializeToCSVTest() throws IllegalAccessException {
        String expected = "latasha, W083, 06/01/1987, 04/04/04, 08/08/18, 21 Dekalb ave. Manchester, VT 07493, female, 5-5, Brown";
        String actual = infoManager.serializeToCSV(driversLicense, fields);
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void serializeToCSVHeaderTest() {
        String expected = "name, IDNumber, dateOfBirth, issueDate, expirationDate, address, sex, height, eyeColor";
        String actual = infoManager.serializeToCSVHeader(fields);
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void deserializeFromCSVTest() {
        String CSV = "latasha, W083, 06/01/1987, 04/04/04, 08/08/18, 21 Dekalb ave. Manchester, VT 07493, female, 5-5, Brown";
        String expected = "latasha";
        DriversLicense latasha = infoManager.deserializeFromCSV(CSV);
        String actual = latasha.getName();
        Assert.assertEquals("Values should be equal", expected, actual);
    }
}

