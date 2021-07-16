import Utils.AnsiBackColor;
import Utils.AnsiTextColor;
import Utils.IOConsole;

public class MainApplication {
    public static void main(String[] args) {
        IOConsole console = new IOConsole();
        console.setTextColor(AnsiTextColor.GREEN);
        console.setBackColor(AnsiBackColor.RED);
        console.updateOutputFormat();
        console.println("green");

    }
}
