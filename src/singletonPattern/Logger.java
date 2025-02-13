package singletonPattern;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger Logger() {
        if (instance == null) { // Lazy initialization
            instance = new Logger();
        }
        return instance;
    }
}
