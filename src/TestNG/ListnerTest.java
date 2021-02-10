package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListnerTest implements ITestListener {
  @Test
  public void f() {
  }

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(result.getName()+"starting method executed");
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(result.getName()+"Test is sucessfully executed");
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(result.getName()+"On Test Failure");
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(result.getName()+"On test Skipped");
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(result.getName()+"Failed but within Sucess ");
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println(context.getName()+"starting method executed");
	//8223328914 pnr no
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println(context.getName()+"method execution finished ");
	
}
}
