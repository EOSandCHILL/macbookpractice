package macBookPractice;

public class Pet {
    private String type;
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String primaryColor;
    private String secondaryColor;
    private String hobby;

    public Pet(String type, String name, String breed, String sex, int age,
               String primaryColor, String secondaryColor, String hobby) {
        this.type = type;
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.hobby = hobby;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String secondaryColor) {
        this.hobby = hobby;
    }

    public void petDescription() {
        System.out.printf("My " + getType() + "s name is " + getName() + ", a " + getSex() + " "
        + getBreed() + ", with a " + getPrimaryColor() + " fur coat and a " + getSecondaryColor() + " chest. He " +
                "is " + getAge() + " years old and loves to " + getHobby() + ".");
    }
    
    
}
