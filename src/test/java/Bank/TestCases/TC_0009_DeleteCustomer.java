package Bank.TestCases;

import Bank.PageObjects.BaseClass;
import Bank.PageObjects.DeleteCustomerPage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class TC_0009_DeleteCustomer extends BaseClass {
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test(dataProvider = "dummyCustomersId")
    public void deleteCustomerTest(Object customerId) {
        DeleteCustomerPage dp = new DeleteCustomerPage(driver);
        driver.get(dp.baseUrl);
        dp.getCustomerId().sendKeys(""+customerId);
        dp.getSubmitBTN().click();
        driver.switchTo().alert().accept();
        //dp.closeDriver();

    }

    @DataProvider(name = "dummyCustomersId")
    public Object[][] getDummyCustomersIdTest() throws IOException {
        File data = new File("C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\resources\\customersId.xlsx");
        FileInputStream inputData = new FileInputStream(data);
        Workbook customers = new XSSFWorkbook(inputData);
        Sheet customers1 = customers.getSheet("CustomerId");
        int rows = customers1.getLastRowNum()- customers1.getFirstRowNum();
        System.out.println(rows);
        Object [][] obj = new Object[rows][1];
        int r =0;
        for(int i =1;i<=rows;i++) {
            Row row = customers1.getRow(i);
            for(int j =0;j<row.getLastCellNum();j++) {
                obj[r][j] = row.getCell(j).getNumericCellValue();

            }
            r++;

        }

        return obj;
    }

}



