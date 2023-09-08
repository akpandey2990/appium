package tests;

import utilities.BaseClass;

import org.testng.annotations.Test;

import pages.LabTests;

public class LabTestsTest extends BaseClass {
	LabTests lab = new LabTests();

	@Test
	public void navigateToLabTestsPage()

	{
		lab.moveToLabTestPage();
		System.out.println("Successfully moved to LabTests page");
		navigateBack();
	}

}
