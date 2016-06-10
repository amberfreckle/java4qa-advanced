package logger.demo;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Logger {
    private LogFilter logFilter = new SevelityLevelLogFilter(); //creator

    public void log(String message, int level) {
        if (logFilter.filter(level)) {
            LogWriterFactory.create().write(message);
        }
    }
}

class MainApp {
    public static void main(String[] args) {
        new Logger().log("message", 8);
    }
}
