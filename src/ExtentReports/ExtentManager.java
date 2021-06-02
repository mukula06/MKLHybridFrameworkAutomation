/*
 * Creation : 03-Jan-2019
 */
package ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

import DateAndTimeFormat.DateAndTimeFormatExtentReport;
import PropertyFileReader.FrameworkConfigPropertyFileReader;

public class ExtentManager {
    private static ExtentReports extent;
    private static FrameworkConfigPropertyFileReader config = new FrameworkConfigPropertyFileReader();
    private static DateAndTimeFormatExtentReport dateAndTime = new DateAndTimeFormatExtentReport();

    public synchronized static ExtentReports getReporter() {
        String reportPath = config.getExtentReportPath();
        if (extent == null) {
            // Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir + reportPath + "ExtentReport_" + dateAndTime.getDateAndTime() + "_Results.html", true);
        }
        return extent;
    }
}
