import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String password="Secret_123";
    private String dbUrl="jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);

    }

    public void showErrorMessage(SQLException exception){
        System.err.println("Error: "+exception.getMessage());
        System.err.println("Error code: "+exception.getErrorCode());
    }



}
