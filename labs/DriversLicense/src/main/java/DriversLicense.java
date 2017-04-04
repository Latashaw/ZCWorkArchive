/**
 * Created by latashawatson on 2/8/17.
 */
public class DriversLicense {
    public String name;
    public String IDNumber;
    public String dateOfBirth;
    public String issueDate;
    public String expirationDate;
    public String address;
    public String sex;
    public String height;
    public String eyeColor;

    public String getName() {
        return name;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getHeight() {
        return height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public DriversLicense(String name, String IDNumber, String dateOfBirth, String issueDate, String expirationDate, String address, String sex, String height, String eyeColor) {
        this.name = name;
        this.IDNumber = IDNumber;
        this.dateOfBirth = dateOfBirth;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.address = address;
        this.sex = sex;
        this.height = height;
        this.eyeColor = eyeColor;
    }

}
