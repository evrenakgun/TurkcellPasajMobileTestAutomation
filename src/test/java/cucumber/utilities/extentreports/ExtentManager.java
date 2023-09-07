package cucumber.utilities.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("target/SparkReport/automation-report.html");
        reporter.config().setReportName("Turkcell Pasaj Mobile Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Turkcell", "Turkcell Pasaj Mobile");
        extentReports.setSystemInfo("Author", "Evren Akgun");

        return extentReports;
    }
}
