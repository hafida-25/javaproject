package fourthpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileUtils {
    // use the blew code
    //make them reusable to read any file's any data
    //meaning create a method wich will take 2 params
    // one the location of the file ,one the key that you want to read
    // based on the key and file path your method should return the value from the propertie file

    public static String  getDataFromPropertiesFile (String fileLocation,String key) throws IOException {
        Properties properties = new Properties();

        InputStream inputStream = new FileInputStream(fileLocation);
        properties.load(inputStream);

        String value = properties.getProperty(key);
        return value;
    }
   /* public static int getResult (int a,int b) {
        int c = a + b;
        return c;
    }*/




    public static void main(String[] args) throws IOException {
        /*int data1 = getResult(10,20);
System.out.println(data1);
int data2 = getResult(10,30);
System.out.println(data2);*/



      String value  = getDataFromPropertiesFile("src/fourthpackage/config.properties","dbName");
System.out.println(value);

    }
}