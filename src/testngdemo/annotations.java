package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
  @Test
  public void Testcase1() {
	  System.out.println("Test case 1");
  }
  
  @BeforeTest
  public void Before_test()
  {
	  System.out.println("Before testcase");
  }
  
  @AfterTest
  public void After_test()
  {
	  System.out.println("After testcase");
  }
  @Test
  public void testcase2()
  {
	  System.out.println("Test case 2");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("Before method");
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("After method");
  }
  
  @AfterClass
  public void afterclass()
  {
	  System.out.println("After Class");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Before Class");
  }
  
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("Before suite");
  }
  
  
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("after suite");
  }
  
}
