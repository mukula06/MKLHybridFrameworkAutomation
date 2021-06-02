/*
 * Creation : 03-Jan-2019
 */
package PropertyFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class FrameworkConfigPropertyFileReader {
    private Properties properties;
    private final String propertyFilePath = "configs//FrameworkConfiguration.properties";
    private String log4jConfPath = "configs//log4j.properties";

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(FrameworkConfigPropertyFileReader.class.getName());

    public FrameworkConfigPropertyFileReader() {
        BufferedReader reader;
        try {

            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
                log.info("Property file loaded: " + propertyFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            log.error("FrameworConfiguration.properties not found at " + propertyFilePath);
            throw new RuntimeException("FrameworConfiguration.properties not found at " + propertyFilePath);
        }
    }

    public String getBrowser() {
        String browser = properties.getProperty("Browser");
        if (browser != null) {
            log.info("Value specified in ConfigFile for browser: " + browser);
            return browser;
        } else {
            log.error("Browser not specified in the FrameworConfiguration.properties file.");
            throw new RuntimeException("Browser not specified in the FrameworConfiguration.properties file.");
        }
    }

    public String getIEDriverfilePath() {
        String ieDriverfilePath = properties.getProperty("IEDriverfilePath");
        if (ieDriverfilePath != null) {
            log.info("Value specified in ConfigFile for ieDriverfilePath: " + ieDriverfilePath);
            return ieDriverfilePath;
        } else {
            log.error("IEDriverfilePath not specified in the FrameworConfiguration.properties file.");
            throw new RuntimeException("IEDriverfilePath not specified in the FrameworConfiguration.properties file.");
        }
    }

    public String getChromeDriverFilePath() {
        String chromeDriverFilePath = properties.getProperty("ChromeDriverFilePath");
        if (chromeDriverFilePath != null) {
            log.info("Value specified in ConfigFile for chromeDriverFilePath: " + chromeDriverFilePath);
            return chromeDriverFilePath;
        } else {
            log.error("ChromeDriverFilePath not specified in the FrameworConfiguration.properties file.");
            throw new RuntimeException("ChromeDriverFilePath not specified in the FrameworConfiguration.properties file.");

        }
    }

    public String getlog4jConfPath() {
        String Log4jConfPath = properties.getProperty("log4jConfPath");
        if (Log4jConfPath != null) {
            log.info("Value specified in ConfigFile for Log4jConfPath: " + Log4jConfPath);
            return Log4jConfPath;
        } else {
            log.error("Log4jConfPath not specified in the FrameworConfiguration.properties file.");
            throw new RuntimeException("Log4jConfPath not specified in the FrameworConfiguration.properties file.");

        }
    }

    public String getExtentReportPath() {
        String extentReportPath = properties.getProperty("ExtentReportPath");
        if (extentReportPath != null) {
            log.info("Value specified in ConfigFile for extentReportPath: " + extentReportPath);
            return extentReportPath;
        } else {
            log.error("ExtentReportPath not specified in the FrameworConfiguration.properties file.");
            throw new RuntimeException("ExtentReportPath not specified in the FrameworConfiguration.properties file.");

        }
    }

    public long getExplicitWaitTime() {
        long ExplicitWaitTime = Long.parseLong(properties.getProperty("ExplicitWaitTime"));
        if (ExplicitWaitTime != 0) {
            log.info("Value specified in ConfigFile for ExplicitWaitTime: " + ExplicitWaitTime);
            return ExplicitWaitTime;
        } else {
            log.error("ExplicitWaitTime not specified in the FrameworConfiguration.properties file.");
            throw new RuntimeException("ExplicitWaitTime not specified in the FrameworConfiguration.properties file.");

        }
    }
}
