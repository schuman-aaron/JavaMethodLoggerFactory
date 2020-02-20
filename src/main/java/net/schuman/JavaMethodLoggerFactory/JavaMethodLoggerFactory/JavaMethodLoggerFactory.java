package net.schuman.JavaMethodLoggerFactory.JavaMethodLoggerFactory;

import java.util.logging.Logger;

/**
 * 
 * @author Aaron Schuman
 * 
 * A factory that creates {@link JavaMethodLogger Java method loggers}.
 *
 */
public class JavaMethodLoggerFactory implements IMethodLoggerFactory<JavaMethodLogger> {

	private Logger logger;
	private String className;
	private JavaMethodLogger methodLogger;
	
	public JavaMethodLoggerFactory(Logger logger, String className) {
		super();
		this.logger = logger;
		this.className = className;
	}

	/**
	 * Creates a method logger.
	 * @param methodName 			The name of the method to be logged.
	 * @return The method logger
	 */
	public JavaMethodLogger createMethodLogger(String methodName) {
		methodLogger = new JavaMethodLogger(logger, className, methodName); 
		return methodLogger;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * Creates a method logger and then log the entry of the method.
	 * @param methodName			The name of the method to be logged.
	 * @return The method logger
	 */
	public JavaMethodLogger createMethodLoggerAndLogEntry(String methodName) {
		createMethodLogger(methodName);
		logEntryOfMethodLogger();
		return methodLogger;
	}

	protected void logEntryOfMethodLogger() {
		methodLogger.logEntry();
	}

}
