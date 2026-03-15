import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    static Connection con = null;

    public static Connection ConnectToDB() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC",
                        "root", "MySQL_88");
                System.out.println("Database connected!");
            } catch (SQLException e) {
                System.err.println("Connection failed: " + e.getMessage());
            }
        }
        return con;
    }

    public static void main(String[] args) {
        ConnectToDB();
    }
}
