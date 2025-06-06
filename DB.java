import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {
    private static final String URL = "jdbc:postgresql://postgres:5432/tareas_db";
    private static final String USER = "admin";
    private static final String PASSWORD = "adminpass";


public static Connection connect() throws SQLException {
  return DriverManager.getConnection(URL, USER, PASSWORD);
}

}

