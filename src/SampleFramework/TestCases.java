package SampleFramework;

import WebDriverBasics.ActionClassEx1;

public class TestCases extends ActionClassEx1{
	
	public static void TC01_ApplyLeave()
	{
		//Step 1 : Launch application
				launchApp();
				//Step 2 : Login as team member
				loginHRM();
				//Step 3 : Navigate My Leave
				navMyLeavePage();
				//Step 6 : Logout
				logoutHRM();
	}
	
	public static void TC02_CancelLeave()
	{
		//Step 1 : Launch application
				launchApp();
				//Step 2 : Login as team member
				loginHRM();
				//Step 3 : Navigate My Leave
				navMyLeavePage();
				//Step 6 : Logout
				logoutHRM();
	}
}
