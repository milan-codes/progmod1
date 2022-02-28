package lecture2.register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTest {

    Note note = new Note();

    @Test
    public void testSetName() {
        String name = "John Doe";
        note.setName(name);
        assertEquals(name, note.getName());
    }

    @Test
    public void testSetTopic() {
        String topic = "Programming";
        note.setTopic(topic);
        assertEquals(topic, note.getTopic());
    }

    @Test
    public void testSetText() {
        String text = "Developers write unit test to test their codes.";
        note.setText(text);
        assertEquals(text, note.getText());
    }

    @Test
    public void testGetNoteText() {
        String name = "Kate", topic = "Java", text = "programming language";
        note.setName(name);
        note.setTopic(topic);
        note.setText(text);
        assertEquals(name + " (" + topic + "): " + text, note.getNoteText());
    }
}
