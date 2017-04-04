import java.lang.reflect.Field;

/**
 * Created by latashawatson on 2/8/17.
 */
public class InfoManager {

    public String serializeToCSV(DriversLicense driversLicense, Field[] fields) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder(18);
        for (Field f : fields) {
            Object value = f.get(driversLicense);
            sb.append(value);
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        String result = sb.toString();
        System.out.println(result);
        return sb.toString();
    }

    public String serializeToCSVHeader(Field[] fields) {
        StringBuilder sb = new StringBuilder(18);
        for (Field f : fields) {
            sb.append(f.getName());
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        String result = sb.toString();
        System.out.println(result);
        return sb.toString();
    }

    public DriversLicense deserializeFromCSV(String csv) {
        String[] parts = csv.split(", ");
        String name = parts[0];
        String IDNumber = parts[1];
        String dateOfBirth = parts[2];
        String issueDate = parts[3];
        String expirationDate = parts[4];
        String address = parts[5];
        String sex = parts[6];
        String height = parts[7];
        String eyeColor = parts[8];
        return new DriversLicense(name, IDNumber, dateOfBirth, issueDate, expirationDate, address, sex, height, eyeColor);
    }


}