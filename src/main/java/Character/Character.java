package Character;

import GameMessage.Dialogue;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private int dialogueIndex;
    private List<Dialogue> dialogue = new ArrayList<>();

    public Character(String name){
        this.name = name;
        this.dialogueIndex = 0;
    }

    public void addDialogue(Dialogue dg){
        this.dialogue.add(dg);
    }

    public Dialogue getDialogue(){
        return this.dialogue.get(this.dialogueIndex);
    }

    public void speak(){
        this.getDialogue().deliverDialogue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDialogueIndex() {
        return dialogueIndex;
    }

    public void setDialogueIndex(int dialogueIndex) {
        this.dialogueIndex = dialogueIndex;
    }
}
