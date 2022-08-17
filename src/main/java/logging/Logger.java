package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.simple.SimpleLogger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.PropertiesUtil;

import java.io.PrintStream;


public class Logger extends SimpleLogger {

    public Logger(String name, 
        Level defaultLevel, 
        boolean showLogName, 
        boolean showShortLogName, 
        boolean showDateTime, 
        boolean showContextMap, 
        String dateTimeFormat, 
        MessageFactory messageFactory, 
        PropertiesUtil props, 
        PrintStream stream) {
        
        super(name, defaultLevel, showLogName, showShortLogName, showDateTime, showContextMap, dateTimeFormat, messageFactory, props, stream);
        
    }

    public void someMethod() {
        ;
    }

    public static void main(String[] args) {
        System.out.println("Logger.java: hello world!");
    }
    
}