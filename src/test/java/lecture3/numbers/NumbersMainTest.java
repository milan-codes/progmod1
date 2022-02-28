package lecture3.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersMainTest  {

    @Test
    public void testSubtractFiveIfGreaterThanFiveWithZero() {
        assertEquals(0, NumbersMain.subtractFiveIfGreaterThanFive(0));
    }

    @Test
    public void testSubtractFiveIfGreaterThanFiveWithFive() {
        assertEquals(5, NumbersMain.subtractFiveIfGreaterThanFive(5));
    }

    @Test
    public void testSubtractFiveIfGreaterThanFiveWithSix() {
        assertEquals(1, NumbersMain.subtractFiveIfGreaterThanFive(6));
    }

    @Test
    public void testConvertDoubleToDoubleWithIntegerLiteral() {
        assertEquals(6.0, NumbersMain.convertDoubleToDouble(6));
    }

    @Test
    public void testConvertDoubleToDoubleWithDoubleLiteral() {
        assertEquals(3.0, NumbersMain.convertDoubleToDouble(3.14));
    }

    @Test
    public void testConvertIntToByte1() {
        assertEquals(-1, NumbersMain.convertIntToByte(-2));
    }

    @Test
    public void testConvertIntToByte2() {
        assertEquals(0, NumbersMain.convertIntToByte(0));
    }

    @Test
    public void testConvertIntToByte3() {
        assertEquals(1, NumbersMain.convertIntToByte(1));
    }

    @Test
    public void testConvertIntToByte4() {
        assertEquals(127, NumbersMain.convertIntToByte(127));
    }

    @Test
    public void testConvertIntToByte5() {
        assertEquals(-1, NumbersMain.convertIntToByte(128));
    }

    @Test
    public void testGetFirstDecimal1() {
        assertEquals(0, NumbersMain.getFirstDecimal(0.0));
    }

    @Test
    public void testGetFirstDecimal2() {
        assertEquals(1, NumbersMain.getFirstDecimal(0.1));
    }

    @Test
    public void testGetFirstDecimal3() {
        assertEquals(0, NumbersMain.getFirstDecimal(0.01));
    }

    @Test
    public void testGetFirstDecimal4() {
        assertEquals(1, NumbersMain.getFirstDecimal(3.14));
    }
}