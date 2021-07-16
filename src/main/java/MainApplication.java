import Utils.AnsiBackColor;
import Utils.AnsiFormat;
import Utils.AnsiTextColor;
import Utils.IOConsole;

public class MainApplication {
    public static void main(String[] args) {
        IOConsole console = new IOConsole();
        console.setBackColorWithoutUpdate(AnsiBackColor.BLUE);
        console.setTextColorWithoutUpdate(AnsiTextColor.BLACK);
        console.setFormat(AnsiFormat.UNDERLINE);
        console.println("Gross");
        console.println("Test");
        console.setBackColor(AnsiBackColor.GREEN);
        console.println("Even More Gross");
        console.setFormat(AnsiFormat.NORMAL);
        console.println("Without underline");
        console.revertAllTextFormatting();
        console.println("Ahh, that's better");

    }
}
