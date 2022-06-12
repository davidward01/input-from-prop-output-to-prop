import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {
    public static void main(String[] args) throws IOException {

        //read from sandbox_reader.properties
        String inputFilePath = "sandbox_reader.properties";
        Properties prop = new Properties();
        FileInputStream inputStream = new FileInputStream(inputFilePath);
        prop.load(inputStream);
        String num = prop.getProperty("num");
        int numInt = Integer.parseInt(num);
        System.out.println(numInt);
        if (numInt >= 16){
            numInt = 0;
        } else {
            numInt++;
        }
        /**
         * code block goes here
         */
        //write to sandbox_reader.properties
        String newNum = String.valueOf(numInt);
        System.out.println("newNum = " + newNum);
        FileOutputStream outputStream = new FileOutputStream(inputFilePath);
        prop.setProperty("num", newNum);
        prop.store(outputStream,null);
    }
}
