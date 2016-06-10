package logger.demo;

public class ConsoleLogWriter implements LogWriter {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
