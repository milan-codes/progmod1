package lecture6.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitTest {
    @Test
    public void testFruitSetName() {
        String name = "grape";

        Fruit fruit = new Fruit();
        fruit.setName(name);

        assertEquals(name, fruit.getName());
    }

    @Test
    public void testFruitSetWeight() {
        double weight = 3;

        Fruit fruit = new Fruit();
        fruit.setWeight(weight);

        assertEquals(weight, fruit.getWeight(), 0.01);
    }

    @Test
    public void testGrapeInheritance() {
        String name = "grape";
        double weight = 3;

        Grape grape = new Grape();
        grape.setName(name);
        grape.setWeight(weight);

        assertEquals(name, grape.getName());
        assertEquals(weight, grape.getWeight(), 0.01);
    }

    @Test
    public void testGrapeSetType() {
        String type = "red";

        Grape grape = new Grape();
        grape.setType(type);

        assertEquals(type, grape.getType());
    }

    @Test
    public void testAppleInheritance() {
        String name = "gala";
        double weight = 3;

        Apple apple = new Apple();
        apple.setName(name);
        apple.setWeight(weight);

        assertEquals(name, apple.getName());
        assertEquals(weight, apple.getWeight(), 0.01);
    }

    @Test
    public void testAppleSetPieces() {
        int pieces = 3;

        Apple apple = new Apple();
        apple.setPieces(pieces);

        assertEquals(pieces, apple.getPieces());
    }

    @Test
    public void testAppleSetColor() {
        Colour color = Colour.GREEN;

        Apple apple = new Apple();
        apple.setColour(color);

        assertEquals(color, apple.getColour());
    }

    @Test
    public void testGrannySmithInheritance() {
        String name = "Granny Smith";
        double weight = 2;
        int pieces = 7;

        GrannySmith apple = new GrannySmith();
        apple.setName(name);
        apple.setWeight(weight);
        apple.setPieces(pieces);

        assertEquals(name, apple.getName());
        assertEquals(weight, apple.getWeight(), 0.01);
        assertEquals(pieces, apple.getPieces());
        assertEquals(Colour.GREEN, apple.getColour());
    }

    @Test
    public void testGalaInheritance() {
        String name = "Gala";
        double weight = 1;
        int pieces = 5;

        Gala apple = new Gala();
        apple.setName(name);
        apple.setWeight(weight);
        apple.setPieces(pieces);

        assertEquals(name, apple.getName());
        assertEquals(weight, apple.getWeight(), 0.01);
        assertEquals(pieces, apple.getPieces());
        assertEquals(Colour.RED, apple.getColour());
    }
}