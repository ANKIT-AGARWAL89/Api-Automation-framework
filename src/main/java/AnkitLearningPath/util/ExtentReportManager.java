package AnkitLearningPath.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {
    ExtentSparkReporter htmlReporter;  // UI of the report
    ExtentReports report;            // common info about report
    ExtentTest test;                 // updating the test result

    public void onStart(ITestContext context) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date dt = new Date();
        String timeStampOfReport = df.format(dt);
        String reportName = "Test-Report-"+timeStampOfReport+".html";

        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"/reports/" +reportName);
        // config for UI of the report
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("PetStore FT");
        htmlReporter.config().setTheme(Theme.DARK);

        report = new ExtentReports();
        report.attachReporter(htmlReporter);

        // adding enviroment details
        report.setSystemInfo("machine", "abc");
        report.setSystemInfo("os", "windows11");
        report.setSystemInfo("user", "Ankit");
        report.setSystemInfo("env", "qa");
    }

    public void onTestSuccess(ITestResult result) {
        test = report.createTest(result.getTestClass().getName());  // create a new entity in a report
//        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.PASS,"Test case passed is: "+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = report.createTest(result.getTestClass().getName());
//        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL, "Test case failed is: "+result.getName());
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onTestSkipped(ITestResult result) {
        test = report.createTest(result.getTestClass().getName());
//        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP, "Test case skip is: "+result.getName());
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext context) {
        report.flush();
    }

}
