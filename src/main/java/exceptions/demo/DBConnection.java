package exceptions.demo;

import java.sql.SQLException;

public class DBConnection implements AutoCloseable {
    public void close() throws SQLException {
        throw new RuntimeException("qqq");
    }

    public void getSmth() throws SQLException {
        throw new SQLException();
    }
}
