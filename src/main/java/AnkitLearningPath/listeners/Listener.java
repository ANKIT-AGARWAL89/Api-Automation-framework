package AnkitLearningPath.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("only once.."); // only once at start
    }

    public void onTestStart(ITestResult result) {
        // not implemented
        System.out.println("before each test start");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("test passed...");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("test failed...");
    }


    public void onTestSkipped(ITestResult result) {
        System.out.println("test skipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("test finished..."); // only once at last
    }
}
