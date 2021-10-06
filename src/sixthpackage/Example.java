package sixthpackage;

import java.sql.*;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList<String> data = getDataFromDB("select * from students;","name");
     System.out.println(data);
    }
    // create a method
    // which will take a query and a column name
    // based on the data provided . the method should return all (so we use arraylist) the values of the column from the data base

    public static ArrayList<String> getDataFromDB(String query, String columnName) throws ClassNotFoundException, SQLException {
        String username = "root";
        String password = "root1234";
        String dbName ="peoplentech";

        String url ="jdbc:mysql://localhost:3306/"+dbName+"?serverTimezone=UTC&useSSL=false";


        Class.forName("com.mysql.cj.jdbc.Driver"); // never  change these name
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);
        ArrayList<String> datalist = new ArrayList<>();

        while (table.next()){
           String data = table.getString(columnName);
           datalist.add(data);
        }
        statement.close();
        connection.close();
        return datalist;
    }
}
