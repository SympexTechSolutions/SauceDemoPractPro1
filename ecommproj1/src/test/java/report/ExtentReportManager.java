package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(
                            "./Reports/AutomationReport.html");

            extent = new ExtentReports();

            extent.attachReporter(sparkReporter);
        }

        return extent;
    }
}
