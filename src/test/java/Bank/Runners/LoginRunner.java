package Bank.Runners;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class LoginRunner {
    public static void main(String[] args) {
        List<String> loginXML = new ArrayList<>();
        loginXML.add("C:\\Users\\Dima\\Desktop\\TestngProject\\testng_login.xml");

        TestNG runner = new TestNG();
        runner.setTestSuites(loginXML);
        runner.run();
    }
}
