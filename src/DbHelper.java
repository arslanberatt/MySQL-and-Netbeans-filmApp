import java.sql.*;
public class DbHelper {
    private String username = "root";
    private String password = "123";
    private String dbUrl="jdbc:mysql://localhost:3306/filmapp";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, username, password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+ exception.getMessage());
        System.out.println("Hata kodu: "+exception.getErrorCode());
    }
}
