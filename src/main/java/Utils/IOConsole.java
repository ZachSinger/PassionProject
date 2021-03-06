package Utils;


import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author ZachSinger
 * @created 07/16/2021 - 5:26 PM
 * handles input/output for display/retrieving data to/from the User
 */
public class IOConsole {
    private final Scanner input;
    private final PrintStream output;
    private AnsiTextColor textColor = AnsiTextColor.NONE;
    private AnsiBackColor backColor = AnsiBackColor.NONE;
    private AnsiFormat formatting = AnsiFormat.NONE;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }

    public void setBackColor(AnsiBackColor color){
        this.backColor = color;
        this.updateOutputFormat();
    }

    public void setBackColorWithoutUpdate(AnsiBackColor color){
        this.backColor = color;
    }

    public void setTextColor(AnsiTextColor color){
        this.textColor = color;
        this.updateOutputFormat();
    }

    public void setTextColorWithoutUpdate(AnsiTextColor color){
        this.textColor = color;
    }

    public void setFormat(AnsiFormat format){
        this.formatting = format;
        this.updateOutputFormat();
    }

    public void setFormatWithoutUpdate(AnsiFormat format){
        this.formatting = format;
    }

    public void revertAllTextFormatting(){
        this.setFormat(AnsiFormat.NORMAL);
    }

    public void updateOutputFormat(){
        if(this.formatting == AnsiFormat.NORMAL){
            this.output.format(this.formatting.getFormat());
        } else {
            this.output.format(this.backColor.getColor() +
                    this.formatting.getFormat() +
                    this.textColor.getColor());
        }
    }

    public void setWait(int milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            this.println("Wait unsuccessful, refer to error message");
        }
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Double getDoubleInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Double doubleInput = Double.parseDouble(stringInput);
            return doubleInput;
        } catch (NumberFormatException nfe) {
            println("input [ %s ] not valid", stringInput);
            println("Input numeric value");
            return getDoubleInput(prompt, args);
        }
    }

    public Long getLongInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Long longInput = Long.parseLong(stringInput);
            return longInput;
        } catch (NumberFormatException nfe) {
            println("input [ %s ] not valid", stringInput);
            println("Input must be numeric, and in Integer format");
            return getLongInput(prompt, args);
        }
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        Integer input = getLongInput(prompt, args).intValue();
        return input;
    }

    public void newLine(){
        this.output.println();
    }

    public void pressEnterToProceed(){
        this.input.nextLine();
    }
}
