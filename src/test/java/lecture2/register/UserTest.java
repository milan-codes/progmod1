package lecture2.register;

import lecture6.inheritance.EyeColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    int baseYear = 1999;
    User user = new User();

    @Test
    public void testSetName() {
        String name = "John Doe";
        user.setName(name);
        assertEquals(name, user.getName());
    }

    @Test
    public void testSetBirthYear() {
        int birthYear = 1984;
        user.setBirthYear(birthYear);
        assertEquals(birthYear, user.getBirthYear());
    }

    @Test
    public void testSetAddress() {
        String address = "Baker Street 221B";
        user.setAddress(address);
        assertEquals(address, user.getAddress());
    }

    @Test
    public void testAgeInBirthYear() {
        user.setBirthYear(baseYear);
        assertEquals(0, user.ageIn(baseYear));
    }

    @Test
    public void testAgeInYearBeforeBirthYear() {
        int year = baseYear - 1;
        user.setBirthYear(baseYear);
        assertEquals(0, user.ageIn(year));
    }

    @Test
    public void testAgeInAfterBirthYear() {
        int expectedAge = 1;
        int year = baseYear + expectedAge;
        user.setBirthYear(baseYear);
        assertEquals(expectedAge, user.ageIn(year));
    }


    @Test
    public void testEyeColorConstructor() {
        User blueEyeUser = new User("John Doe", 2000, "Baker Street", EyeColor.BLUE);
        assertEquals(EyeColor.BLUE, blueEyeUser.getEyeColor());
    }

}
