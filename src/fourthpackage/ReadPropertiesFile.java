package fourthpackage;
import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // if a calass has abstract before class name we can't create obj the tradional way

        /*try {
            InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } */

        InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties");
        properties.load(inputStream);

        String dbNameFromFile = properties.getProperty("dbName");
        String dbUserFromFile = properties.getProperty("dbUser");
        String dbPasswordFromFile = properties.getProperty("dbPassword");
    System.out.println(dbNameFromFile);
        System.out.println(dbUserFromFile);
        System.out.println(dbPasswordFromFile);
    }
}


