package lecture3.numbers;

public class NumbersMain {

    /**
     * Task 1: Create a main method into NumbersMain class.
     * Create new variables:
     * - Name: a, type: int, value: 5
     * - Name: b, type: Integer, value: 5
     * - Name: c, type: Integer, value: variable a
     * - Name: d, type: Integer, value: variable b
     * - Name: e, type: Integer, value: new Integer object created with literal 5
     * - Name: f, type: int, value: new Integer object created with literal 5
     * - Name: g, type: int, value: new Integer object created with variable a
     * - Name: h, type: int, value: new int value get by intValue method of variable c
     * - Name: i, type: int, value: parsed from literal "5"
     * - Name: j, type: Integer, value: parsed from literal "5"
     * Print these variables.
     * Convert literals and variables:
     * - int (5 and 32768) to byte
     * - int (5 and 32768) to short
     * - int (5 and 32768) to long
     * - long (22_000_000L) to int
     */

    public static void main(String[] args) {
        int a = 5;
        Integer b = 5;
        Integer c = a;
        Integer d = b;
        Integer e = new Integer(5);
        int f = new Integer(5);
        int g = new Integer(a);
        int h = c.intValue();
        int i = Integer.parseInt("5");
        Integer j = Integer.parseInt("5");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

        convertIntToByteAndPrint(5);
        convertIntToByteAndPrint(32768);

        convertIntToShort(5);
        convertIntToShort(32768);

        convertIntToLong(5);
        convertIntToLong(32768);

        convertLongToInt(22_000_000L);
    }

    private static void convertIntToByteAndPrint(int num) {
        System.out.printf("int %d in byte: 0x%02X\n", num, (byte) num);
    }

    private static void convertIntToShort(int num) {
        System.out.printf("int %d in short: %d\n", num, (short) num);
    }

    private static void convertIntToLong(int num) {
        System.out.printf("int %d in long: %d\n", num, (long) num);
    }

    private static void convertLongToInt(long num) {
        System.out.printf("long %d in int: %d\n", num, (int) num);
    }

    public static int subtractFiveIfGreaterThanFive(int number) {
        if (number > 5) {
            return number - 5;
        }
        return number;
    }

    public static double convertDoubleToDouble(double number) {
        int intNum = (int) number;
        return (double) intNum;
    }

    public static byte convertIntToByte(int number) {
        if (number < 0 || number > 127) {
            return -1;
        }
        return (byte) number;
    }

    public static int getFirstDecimal(double number) {
        int intPartOfNumber = (int) number;
        double realPart = number - intPartOfNumber;
        return (int) (realPart * 10);
    }
}
