package framework11;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	public class Test1 
	{
			@Test(priority=1)
			public void data1()
			{
				Reporter.log("1" ,true);
				
			}
			@Test
			public void data2()
			{
				Reporter.log("5" ,true);
				
			}
	}

}
