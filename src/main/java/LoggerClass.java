import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerClass {
    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    public static void main(String[] args) {
        loggerWarn.warn("warn");
        loggerInfo.info("info");
        loggerError.error("error");
    }

}
