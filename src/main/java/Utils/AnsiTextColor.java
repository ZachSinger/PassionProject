package Utils;

public enum AnsiTextColor {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    NONE("");

    private final String color;

    AnsiTextColor(String ansiColor) {
        this.color = ansiColor;
    }

    public String getColor() {
        return color;
    }

}