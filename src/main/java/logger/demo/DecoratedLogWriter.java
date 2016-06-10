package logger.demo;

public class DecoratedLogWriter extends ConsoleLogWriter {
    private String prefix;

    public DecoratedLogWriter(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void write(String message) {
        super.write(prefix + message);
    }
}
