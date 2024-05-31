package com.crm.listernersCode;

import org.testng.ITestListener;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;

import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ExtentReport.DwsBaseClass;
@Listeners(com.crm.listernersCode.TakeScreenShotWithExtentReport.class)
public class TakeScreenShotWithExtentReport extends DwsBaseClass implements ITestListener {
	
		public ExtentReports report;
		public ExtentSparkReporter spark;
		public ExtentTest test;

		@Override
		public void onTestStart(ITestResult result) {
			String name=result.getMethod().getMethodName();
			test=report.createTest(name);
			test.log(Status.INFO, "hellow everyone....");
			test.log(Status.INFO, "Good morning....");)
			}

		@Override
		public void onTestSuccess(ITestResult result) {	
			test.log(Status.PASS, "your test case is passed");				
		}

		@Override
		public void onTestFailure(ITestResult result) {
			test.log(Status.FAIL,"your test case is failed");
			TakesScreenshot ts=(TakesScreenshot) driver;
			String from = ts.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(from)
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			
			test.log(Status.SKIP, "your testcase is Skipped");
		
			
		}

		@Override
		public void onStart(ITestContext context) {
			File path=new File("./ExtentReport/TestRun.html");
			spark=new ExtentSparkReporter(path);
			spark.config().setDocumentTitle("DemoWorkShop");
			spark.config().setReportName("Anuja");
			spark.config().setTheme(Theme.DARK);
			report=new ExtentReports();
			report.setSystemInfo("OS", "Window-10");
			report.setSystemInfo("Browser", "Chrome");
			report.attachReporter(spark);
		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("OnFinish");
			report.flush();
			
		}
	}



