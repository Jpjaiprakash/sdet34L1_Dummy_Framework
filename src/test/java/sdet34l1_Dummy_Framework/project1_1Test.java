package sdet34l1_Dummy_Framework;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class project1_1Test  {
	
	@Test(groups="sanity")
	public void practice1test() {
		Reporter.log("TestNgPractie1----> Test1",true);
	}
	
	@Test(groups="sanity")
	public void practice2test() {
		Reporter.log("TestNgPractice1----> Test2",true);	
	}
	
	@Test(groups="regression")
	public void practice3test() {
		Reporter.log("TestNgPractice1----> Test3",true);
	}
}
