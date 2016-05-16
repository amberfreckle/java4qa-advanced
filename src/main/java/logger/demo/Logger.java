package logger.demo;

public class Logger {
    public static void log(String message, int level) {
        if (filter(level)) {
            write(message);
        }
    }

    private static void write(String message) {

    }

    private static boolean filter(int level) {
        return false;
    }
}

class MainApp {
    public static void main(String[] args) {
        Logger.log("mghgjhgjhg", 9);
    }
}
