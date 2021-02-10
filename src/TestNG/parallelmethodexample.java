package TestNG;

import org.testng.annotations.Test;

public class parallelmethodexample {
  @Test
  public void testone() throws InterruptedException {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println("this is method one"+i);
		  Thread.sleep(1000);
		  System.out.println(Thread.currentThread().getId());
			 
	  }
  }
  @Test
  public void testwo() throws InterruptedException {
	  for(int i=100;i<=110;i++)
	  {
		  System.out.println("this is method two"+i);
		  Thread.sleep(1000);
		  System.out.println(Thread.currentThread().getId());
		  
	  }
  }

}
