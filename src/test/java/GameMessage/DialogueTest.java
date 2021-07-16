package GameMessage;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DialogueTest {

    @Test
    public void nullaryConstructorTest(){
        Dialogue dg = new Dialogue();

        String expected = "I have no dialogue.";
        String actual = dg.getCurrentDialogue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest1(){
        Dialogue dg = new Dialogue("I am speaking");

        String expected = "I am speaking";
        String actual = dg.getCurrentDialogue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest2(){
        Dialogue dg = new Dialogue("Leave me alone", "I said leave me alone!");

        List<String> dialogues = dg.getDialogues();
        String actual = dialogues.get(1);
        String expected = "I said leave me alone!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNextDialogue() {
        Dialogue dg = new Dialogue("Leave me alone", "I said leave me alone!");

        String actual = dg.getNextDialogue();
        String expected = "I said leave me alone!";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCurrentDialogue() {
        Dialogue dg = new Dialogue("Leave me alone", "I said leave me alone!");

        String actual = dg.getCurrentDialogue();
        String expected = "Leave me alone";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDialogues() {
        Dialogue dg = new Dialogue("Leave me alone", "I said leave me alone!");

        List<String> actual = dg.getDialogues();
        List<String> expected = new ArrayList<>();
        expected.add("Leave me alone");
        expected.add("I said leave me alone!");

        Assert.assertTrue(actual.equals(expected));
    }

    @Test
    public void getDialogueIndex() {
        Dialogue dg = new Dialogue("Leave me alone", "I said leave me alone!");

        Integer expected = 0;
        Integer actual = dg.getDialogueIndex();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDialogueIndex() {
        Dialogue dg = new Dialogue("Leave me alone", "I said leave me alone!");
        dg.setDialogueIndex(1);

        Integer expected = 1;
        Integer actual = dg.getDialogueIndex();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDialogueIndexOutOfBounds(){
        Dialogue dg = new Dialogue("I am a string. Hear me roar!");
        dg.setDialogueIndex(10);

        Integer expected = 0;
        Integer actual = dg.getDialogueIndex();

        Assert.assertEquals(expected, actual);
    }
}