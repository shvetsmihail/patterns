package design_patterns.creational.singelton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        Logger logger1 = Logger.getLogger();

        System.out.println(logger);
        System.out.println(logger1);

        logger.addLog("first");
        logger.addLog("second");
        logger.printLog();
    }
}
