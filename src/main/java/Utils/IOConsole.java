package Utils;


import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author ZachSinger
 * @created 07/16/2021 - 5:26 PM
 * handles input/output for display/retrieving data to/from the User
 */
public class IOConsole {
    private final Scanner input;
    private final PrintStream output;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
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
