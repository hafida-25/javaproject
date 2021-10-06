package sixthpackage;

import java.sql.*;

public class ConnectionForSql1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String username = "root";
        String password = "root1234";
        String dbName ="peoplentech";

        // jdbc:mysql --> driver name
        // localhost --> host name
        // 3306 --> port number

        // if you have erreur you can do that
        // SSL erreor --> ?useSSL=false
        // server timezone --> ?serverTimezone=UTC
        // both --> ?serverTimeZone=UTC&useSSl=false
        String url ="jdbc:mysql://localhost:3306/"+dbName+"?serverTimezone=UTC&useSSL=false";
        String query = "select * from students;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // never  change these name
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

        ResultSet table = statement.executeQuery(query);


        while (table.next()){
            int idFromDb = table.getInt("id");
            String nameFromDb = table.getNString("name");
            String stateFromDb = table.getNString("state");
            String zipcodeFromDb = table.getNString("zipcode");
       System.out.println(idFromDb+" "+ nameFromDb+" "+stateFromDb+" "+zipcodeFromDb);
        }


    }
}
