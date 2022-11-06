package Bank.TestCases;

import Bank.PageObjects.AddNewCustomer;
import Bank.PageObjects.BaseClass;
import Bank.PageObjects.LoginPage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TC_0008_AddNewCustomer extends BaseClass {

    List<String> str = new ArrayList<>();

    @Test(dataProvider = "Customers")
    public void addNewCustomersTest(String name,String gender, String date, String addr, String city,
                                    String state, String pin, String mobile, String email,
                                    String password) throws IOException {
        LoginPage lp = new LoginPage(driver);
        log.info("test");
        lp.homePage(baseURL);
        lp.setUserName("mngr451715");
        lp.setPassword("dyrYnUj");
        lp.submitClick();
        AddNewCustomer nc = new AddNewCustomer(driver);
        driver.get(nc.homeUrl);
        nc.getCustomerName().sendKeys(name);
        //System.out.println(gender.equals("f"));
        if(gender.equals("f")) {
            nc.getFemaleGenderButton().click();
        }else {
            nc.getMaleGenderButton().click();
        }
        nc.getDateField().sendKeys(date);
        nc.getAddr().sendKeys(addr);
        nc.getCity().sendKeys(city);
        nc.getState().sendKeys(state);
        nc.getPIN().sendKeys(pin.substring(1,pin.length()-1));
        nc.getMobile().sendKeys(mobile.substring(1, mobile.length()-1));
        nc.getEmail().sendKeys(email);
        nc.getPassword().sendKeys(password);
        nc.getSubmit().click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")).getText(),
                "Customer Registered Successfully!!!");
        String customerName = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).getText();
        String customerId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText();
        createTxtFileWithCustomerDetails(customerName, customerId);
    }
    public void createTxtFileWithCustomerDetails(String name, String id) throws IOException {
        String userName = name;
        String userId = id;
        String data = userName+"/"+userId;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\Customers\\"+
                userName+"_"+userId+"txt");
        fos.write(data.getBytes());
        fos.flush();
        fos.close();
    }

    @Test(enabled = false)
    public void dateTest() throws InterruptedException {
        AddNewCustomer nc = new AddNewCustomer(driver);
        driver.get(nc.homeUrl);
        nc.getDateField().sendKeys("12022005");
        String str = driver.getCurrentUrl();
        System.out.println(str.substring(str.length()-5));
        Thread.sleep(1000);
    }
    @DataProvider(name = "Customers")
    public Object[][] getFile() throws IOException {

        File data = new File("C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\resources\\customers.xlsx");
        FileInputStream inputData = new FileInputStream(data);
        Workbook customers = new XSSFWorkbook(inputData);
        Sheet customers1 = customers.getSheet("Customers1");
        int rows = customers1.getLastRowNum()- customers1.getFirstRowNum();
        Object [][] obj = new Object[rows][10];
        int r = 0;
        //int c =0;
        //System.out.println(rows);
        for(int i =1;i<=rows;i++) {
            Row row = customers1.getRow(i);
            for(int j =0;j<row.getLastCellNum();j++) {
                obj[r][j] = row.getCell(j).getStringCellValue();
                //System.out.print(row.getCell(j).getStringCellValue()+", ");
            }
            r++;
            //System.out.println();
        }
//        for(int i =0;i<obj.length;i++) {
//            for(int j =0;j<obj[i].length;j++) {
//                System.out.print(obj[i][j]+", ");
//            }
//            System.out.println();
//        }
        return obj;

    }
}
