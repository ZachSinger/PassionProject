package GameMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dialogue {
    private List<String> dialogues = new ArrayList<>();
    private Integer dialogueIndex = 0;

    public Dialogue(){
        this("I have no dialogue.");
    }

    public Dialogue(String dialogue){
        this.dialogues.add(dialogue);
    }

    public Dialogue(String... dialogue){
        this.dialogues = Arrays.asList(dialogue);
    }

    public String getNextDialogue(){
        try {
            return this.dialogues.get(++this.dialogueIndex);
        } catch (Exception e) {
            this.dialogueIndex = 0;
            return this.dialogues.get(this.dialogueIndex);
        }
    }

    public String getCurrentDialogue(){
        return this.dialogues.get(this.dialogueIndex);
    }

    public List<String> getDialogues() {
        return dialogues;
    }

    public Integer getDialogueIndex() {
        return dialogueIndex;
    }

    public void setDialogueIndex(Integer dialogueIndex) {
        this.dialogueIndex = Math.min(dialogueIndex, this.dialogues.size() - 1);
    }


}
