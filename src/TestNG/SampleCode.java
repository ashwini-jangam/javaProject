package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleCode {
  @Test (groups="1")
  public void Add() {
	//System.out.println("new prg");  
	  int a,b,c;
	  a=10;
	  b=20;
	  c = a+b;
	  System.out.println("Addition is " + c );
  }
  @Test (groups = "1")
  public void Mul()
  {
	  int a,b,c;
	  a=10;
	  b=20;
	  c = a*b;
	  System.out.println("Multiplication  is " + c );
  }
  @Test(groups ="2")
  public void Div()
  {
	  int a,b,c;
	  a=100;
	  b=20;
	  c = a/b;
	  System.out.println("Division  is " + c );
  }

  @Test (groups="3")
  public void Sub()
  {
	  int a,b,c;
	  a=30;
	  b=20;
	  c = a-b;
	  System.out.println("Substraction  is " + c );
  }

 
  @BeforeMethod
  public void ftest() {
	  System.out.println("This is before method");
  
  }
  
 /* @AfterTest
  public void atest() {
	  
  }*/
}
