import org.h2.jdbcx.JdbcConnectionPool;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


class simplestCode {

    public static void main(String[] args){

        JdbcConnectionPool cp = JdbcConnectionPool.
                create("jdbc:h2:mem:", "root", "root"); // 
        try (Connection conn = cp.getConnection()) { // 
            System.out.println("Is my database connection valid: " + conn.isValid(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}