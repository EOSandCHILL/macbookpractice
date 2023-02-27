package macBookPractice;

public class Spouse {
    private String sex;
    private String firstName;
    private String middleName;
    private String lastName;
    private int feet;
    private int inches;
    private String marriageDate;

    public Spouse(String sex, String firstName, String middleName, String lastName, int feet, int inches, String marriageDate) {
        this.sex = sex;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.feet = feet;
        this.inches = inches;
        this.marriageDate = marriageDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public String getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(String marriageDate) {
        this.marriageDate = marriageDate;
    }

    public void spouseDetails() {
        System.out.printf("My " + getSex() + "'s name is " + getFirstName() + " "
                + getMiddleName() + " " + getLastName() + ". She's " + getFeet() + " ft "
        + getInches() + ". We got married on " + getMarriageDate() + ".");
    }

}
