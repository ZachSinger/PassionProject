package Utils;

public enum AnsiFormat {
    NORMAL("\u001B[0m"),
    BOLD("\u001B[1m"),
    UNDERLINE("\u001B[4m"),
    BLINK("\u001B[5m"),
    REVERSE("\u001B[7m"),
    INVISIBLE("\u001B[8m");

    private final String formatting;

    AnsiFormat(String ansiFormat) {
        this.formatting = ansiFormat;
    }

    public String getFormat() {
        return formatting;
    }
}
