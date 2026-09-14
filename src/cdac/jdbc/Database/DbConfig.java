package cdac.jdbc.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    Connection con;

    public DbConfig(){
        try{
            String url = System.getenv("DB_URL");
            String username = System.getenv("DB_USERNAME");
            String password = System.getenv("DB_PASSWORD");

            con = DriverManager.getConnection(url, username, password);

        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getCon(){
        return con;
    }
}
