package design_patterns.creational.singelton;

public class Logger {
    private static Logger logger;
    public String log = "This is log file\n\n";

    public static synchronized Logger getLogger () {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private Logger() {}

    public void addLog(String log) {
        this.log += log + "\n";
    }

    public void printLog() {
        System.out.println(log);
    }

}
