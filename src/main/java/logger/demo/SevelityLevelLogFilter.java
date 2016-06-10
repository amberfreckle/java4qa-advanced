package logger.demo;

public class SevelityLevelLogFilter implements LogFilter {
    @Override
    public boolean filter(int level) {
        return false;
    }
}
