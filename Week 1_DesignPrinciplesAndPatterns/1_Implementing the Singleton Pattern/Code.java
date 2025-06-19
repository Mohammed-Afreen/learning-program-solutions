class Logger {
    
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Initialized.");
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); 
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log Message: " + message);
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger is used.");
        } else {
            System.out.println("Different instances of Logger were created.");
        }
        
    }
}
