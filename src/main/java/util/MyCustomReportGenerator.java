package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyCustomReportGenerator implements ITestListener {

    // This method is called before the test method starts
    @Override
    public void onTestStart(ITestResult result) {
        // You can add your custom report generation logic here
        System.out.println("Test started: " + result.getMethod().getMethodName());
    }

    // This method is called after the test method finishes
    @Override
    public void onTestSuccess(ITestResult result) {
        // You can add your custom report generation logic here
        System.out.println("Test passed: " + result.getMethod().getMethodName());
    }

    // This method is called after the test method fails
    @Override
    public void onTestFailure(ITestResult result) {
        // You can add your custom report generation logic here
        System.out.println("Test failed: " + result.getMethod().getMethodName());
    }

    // This method is called after the test method is skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        // You can add your custom report generation logic here
        System.out.println("Test skipped: " + result.getMethod().getMethodName());
    }

    // This method is called after the entire test suite finishes
    @Override
    public void onFinish(ITestContext context) {
        // You can add your custom report generation logic here
        System.out.println("Test suite finished!");
    }

    // This method is called before the entire test suite starts
    @Override
    public void onStart(ITestContext context) {
        // You can add your custom report generation logic here
        System.out.println("Test suite started!");
    }
}
