package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void callTest() {
		System.out.println("call test");
		
		int a=9/0;
		ExpectedExceptionConcept obj=null;
		obj.name="Tom";
		
	}

	
		

	}


