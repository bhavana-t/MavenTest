package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggerTest {
	
	static String configurationFileNAme ="/Users/bhavana/Downloads/flexontech/WorkSpace/MavenTest/log4j.properties";
	public static final Logger logger =Logger.getLogger(LoggerTest.class.getName());
	//public static final Logger logger =Logger.getLogger("test log");
	@BeforeTest
	public static void getLogConfig()
	{
		PropertyConfigurator.configure(configurationFileNAme);
		
	}
	
	@Test
	public void testLogger()
	{
		
		getLogConfig();
		logger.info("log test1 info");
		logger.error("Log test1 error");
		logger.debug("log test1 debug");
		
	}
	

}
