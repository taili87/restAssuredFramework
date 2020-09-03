package baseTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener {

	@Test
	public void utilsTest() {
		test.log(LogStatus.INFO, "test started....");
		test.log(LogStatus.INFO, "test passed ....");
		
		int a=100;
		int b = 200;
		int sum =a+b;
		System.out.println("Sum of a and b: "+sum );
	}
	
	@Test
	public void utilsTestOne() {
		test.log(LogStatus.INFO, "test started....");
		test.log(LogStatus.INFO, "test passed ....");
		
		int a=100;
		int b = 200;
		int sum =a+b;
		System.out.println("Sum of a and b: "+sum );
	}
	
	@Test
	public void utilsTestTwo() {
		test.log(LogStatus.INFO, "test started....");
		test.log(LogStatus.INFO, "test passed ....");
		
		int a=100;
		int b = 200;
		int sum =a+b;
		System.out.println("Sum of a and b: "+sum );
	}
}
