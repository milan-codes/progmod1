package lecture2.register;

import lecture6.inheritance.EyeColor;

public class User {
    private String name;
    private int birthYear;
    private String address;
    private final EyeColor eyeColor;

    public User() {
        this("John Doe", 1987, "Baker Street 135", EyeColor.BROWN);
    }

    public User(String name, int birthYear, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.eyeColor = EyeColor.BROWN;
    }

    public User(String name, int birthYear, String address, EyeColor eyeColor) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int ageIn(int baseYear) {
        if (baseYear <= birthYear) {
            return 0;
        }
        return baseYear - birthYear;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nBirth year: %d\nAddress: %s\n", name, birthYear, address);
    }
}
