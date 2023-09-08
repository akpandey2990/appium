package tests;

import org.testng.annotations.Test;

import pages.Account;
import utilities.BaseClass;

public class AccountTest extends BaseClass {
	Account act = new Account();

	@Test
	public void moveToAccountsPage()

	{
		act.navigateToAccountsPage();
		System.out.println("Successfully moved to Accounts page");
		navigateBack();
	}

}
