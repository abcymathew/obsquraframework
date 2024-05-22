package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil implements ITestListener {
	private static ExtentReports extentReports;
	ExtentTest extenTest;
	static
	{ 
	String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html"; 
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	htmlReporter.config().setDocumentTitle("Automation Report");
	htmlReporter.config().setReportName("Test Automation Results"); 
	htmlReporter.config().setTheme(Theme.STANDARD);
	extentReports= new ExtentReports(); 
	extentReports.attachReporter(htmlReporter); 
	}
	@Override
	 public void onTestStart(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		 extenTest =extentReports .createTest(testname);
		 extenTest.log(Status.INFO,"Test Started"); 
		   }
	
	@Override
	 public void onTestSuccess(ITestResult result) {
		extenTest.log(Status.PASS,"Test passed"); 
		 }

	@Override	 
	public void onTestFailure(ITestResult result) {
		extenTest.log(Status.FAIL,"test failed"); 
		  }
	@Override
	public void onStart(ITestContext context) {
		System.out.println("extent report-test suite started"+context.getName());
		 }

	@Override 
		public void onFinish(ITestContext context) {
		System.out.println("extent report-test suite finished"+context.getName());
		extentReports.flush();
		 }
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	/*public void createTest(String testname)
	{
 extenTest =extentReports .createTest(testname);
	}
	public void loginfo(String text)
	{
		
		extenTest.log(Status.INFO,text); 
	}
	public void logpass(String text)
	{
		
		extenTest.log(Status.PASS,text); 
	}
	public void logfail(String text)
	{
		
		extenTest.log(Status.FAIL,"test passed"); 
	}
	public void logwarning(String text)
	{
		
		extenTest.log(Status.WARNING,"warning"); 
	}
	public void flush()
	{
		
		extentReports.flush();
	}

}*/
