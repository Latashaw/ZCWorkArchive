import java.lang.reflect.Field;

/**
 * Created by latashawatson on 2/8/17.
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        DriversLicense driversLicense = new DriversLicense("latasha", "W083", "06/01/1987", "04/04/04", "08/08/18", "21 Dekalb ave. Manchester, VT 07493", "female", "5-5", "Brown");
        Field[] fields = driversLicense.getClass().getDeclaredFields();
        String CSV = "latasha, W083, 06/01/1987, 04/04/04, 08/08/18, 21 Dekalb ave. Manchester, VT 07493, female, 5-5, Brown, ";
        InfoManager infoManager = new InfoManager();
        infoManager.serializeToCSV(driversLicense, fields);
        infoManager.serializeToCSVHeader(fields);
        infoManager.deserializeFromCSV(CSV);


    }
}
