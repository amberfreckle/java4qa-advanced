package exceptions.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class ExceptionsDemo {
    public static void main(String[] args) throws EmployeeNotFoundException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        try {
            String name = employeeDAO.getEmployeeNameById(3);
        } catch (RuntimeException e) {
            System.out.println(e.getSuppressed());
        }
        System.out.println("done");
    }
}

class EmployeeDAO {
    public String getEmployeeNameById(int id) throws EmployeeNotFoundException {
        try (DBConnection dbConnection = getConnection()) {
            dbConnection.getSmth();
            //business - logic
        } catch (SQLException e) {
            //0. Logging
            //1. Return default
            //2. Retrying
            //3. Fail-over
            throw new EmployeeNotFoundException("Can't ", e);
        }

        //System.out.println("done...");
        return "";
    }

    //@Retryable(timeout = 10_000, count = 10)
    private DBConnection getConnection() throws SQLException {
        //throw new SQLException("RRRRR");
        return new DBConnection();
    }
}
