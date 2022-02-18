package register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    Song song = new Song();

    @Test
    public void testSetBand() {
        String band = "AC/DC";
        song.setBand(band);
        assertEquals(band, song.getBand());
    }

    @Test
    public void testSetTitle() {
        String title = "Highway to Hell";
        song.setTitle(title);
        assertEquals(title, song.getTitle());
    }

    @Test
    public void testSetLengthInMinutes() {
        double lengthInMinutes = 3.45;
        song.setLengthInMinutes(lengthInMinutes);
        assertEquals(lengthInMinutes, song.getLengthInMinutes(), 0.001);
    }
}