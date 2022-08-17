package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.builder.api.Component;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PropertyConfigurator extends PropertiesConfiguration {

    private static final Logger LOG = LogManager.getLogger(PropertyConfigurator.class);

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("PropertyConfigurator.java: hello world!");
        
        // /home/derek/basic_gradle/src/main/resources/propconfig.xml
        File myXmlFile = new File("/home/derek/basic_gradle/src/main/resources/propconfig.xml");
        InputStream xmlStream = new FileInputStream(myXmlFile);
        Properties props = new Properties();
        props.loadFromXML(xmlStream);

        xmlStream.close();
    }

    static public void configure (Properties props, String applicationName) {

    }

    public PropertyConfigurator(LoggerContext loggerContext,
        ConfigurationSource source,
        Component root) {
            super(loggerContext, source, root);
    }
}