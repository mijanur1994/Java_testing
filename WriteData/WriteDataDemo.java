package WriteData;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {

    public static void main(String[] args) throws IOException {

        //Step 1 : Create an object of FileWriter Class which is already in JAVA
        FileWriter fwt = new FileWriter("D:\\##1Mijanur_Rahaman\\Java_Testing\\Properties_File\\TestData.properties",true);

        //Step 2: Create an object of properties class
        Properties pr = new Properties();

        //Step 3: Use set property method to set property
        pr.setProperty("EmployeeID", "112544");
        pr.store(fwt, "Sample Comments");
    }
}
