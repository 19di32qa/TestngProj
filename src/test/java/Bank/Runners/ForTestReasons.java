package Bank.Runners;

import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ForTestReasons {

    @Test
    public void voidTestCustomersId() throws IOException {
        String userName = "Ivar";
        String userId ="12356";
        String data = userName+"/"+userId;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Dima\\Desktop\\TestngProject\\src\\main\\Customers\\"+
                userName+"_"+userId+"txt");
        fos.write(data.getBytes());
        fos.flush();
        fos.close();
    }

}
