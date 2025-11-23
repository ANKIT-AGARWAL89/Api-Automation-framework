package AnkitLearningPath.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counterForRetryAttempts = 0;
    int setMaxLimitForRetry = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {
            if (counterForRetryAttempts < setMaxLimitForRetry) {
                counterForRetryAttempts++;
                return true;
            }
        }
        return false;
    }
}
