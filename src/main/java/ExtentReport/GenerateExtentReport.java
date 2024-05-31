package ExtentReport;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
@Listeners(ExtentReport.GenerateExtentReport.class)
public class GenerateExtentReport implements ITestListener {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
		System.out.println("OnTestStart");
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.PASS, name+"is paased");
		System.out.println("OnTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.FAIL,name+"is failed");
		System.out.println("OnTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.SKIP, name+"is Skipped");
		System.out.println("OnTestSkipped");
		
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


