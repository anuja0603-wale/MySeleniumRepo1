package com.crm.listernersCode;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


@Listeners(com.crm.listernersCode.Dwslogin.class)																					
public class Dwslogin implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("nTestFailure");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTestStart");

	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("OnStart");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish");

	}
	

}
