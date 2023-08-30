package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
  private static final String DB_DRIVER = "org.h2.Driver";
  private static final String DB_CONNECTION = "jdbc:h2:~/expenses";
  private static final String DB_USER = "sa";
  private static final String DB_PASSWORD = "";

  public static Connection getDBConnection() {
    Connection connection = null;
    try{
      Class.forName(DB_DRIVER);
      connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
    }catch(ClassNotFoundException | SQLException exception){
      exception.printStackTrace();
    }
    return connection;
  }
}
