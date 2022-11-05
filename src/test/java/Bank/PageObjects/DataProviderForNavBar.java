package Bank.PageObjects;

import org.testng.annotations.DataProvider;

public class DataProviderForNavBar {


    @DataProvider (name = "data_of_navbar")
    public Object[][] getData() {

        return new Object[][]{
                {"[href =\"addcustomerpage.php\"]"}, {"[href=\"EditCustomer.php\"]"},
                {"[href =\"DeleteCustomerInput.php\"]"}, {"[href=\"addAccount.php\"]"},
                {"[href =\"editAccount.php\"]"},{"[href=\"deleteAccountInput.php\"]"},
                {"[href=\"MiniStatementInput.php\"]"}, {"[href =\"CustomisedStatementInput.php\"]"},
                {"[href=\"Logout.php\"]"}
        };
    }
}
