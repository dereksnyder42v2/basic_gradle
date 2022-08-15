package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {

	private static final Logger LOG = LogManager.getLogger(Hello.class);

	public static void doLogStuff() {
		LOG.debug("This is a debug message");
		LOG.info("This is an info message");
		LOG.warn("This is a warn message");
		LOG.error("This is an error message");
		LOG.fatal("This is a fatal message");

	}

	public static void main(String[] args) {
		System.out.println("Hello.java: hello world!");
		doLogStuff();
	}

}

