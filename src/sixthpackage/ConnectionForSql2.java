package sixthpackage;

import fourthpackage.PropertiesFileUtils;

import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class ConnectionForSql2 {


    public static Connection connectToMySqlDB() throws SQLException, IOException, ClassNotFoundException {
        //comment lire nous donner qui son  a properties file
        String username = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties","username");
        String password = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties","password");
        String dbName =PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties","dbName");

        String url ="jdbc:mysql://localhost:3306/"+dbName+"?serverTimezone=UTC&useSSL=false";

        Class.forName("com.mysql.cj.jdbc.Driver"); // never  change these name
            Connection connection = DriverManager.getConnection(url, username, password);
          return connection;

    }
     /* public static ResultSet getTableDataFromDB(String query) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = connectToMySqlDB();
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);
        return table;
     } */
    public static void main(String[] args) throws  ClassNotFoundException, SQLException, IOException {
        String query = "select * from students;";
        Connection connection = connectToMySqlDB();
         Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);

        ArrayList<String> names = new ArrayList<>();


        while (table.next()){
            int idFromDb = table.getInt("id");
            String nameFromDb = table.getNString("name");
            String stateFromDb = table.getNString("state");
            String zipcodeFromDb = table.getNString("zipcode");
       System.out.println(idFromDb+" "+ nameFromDb+" "+stateFromDb+" "+zipcodeFromDb);
        }
        System.out.println(names);

          clearDatabase(statement,connection);
    }

        public static void clearDatabase(Statement statement,Connection connection) throws SQLException {
    if(statement!=null){
    statement.close();
        }
            if(connection!=null){
                connection.close();
            }




    }
}
