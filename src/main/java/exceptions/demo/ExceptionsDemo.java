package exceptions.demo;

import java.sql.SQLException;

public class ExceptionsDemo {
    public static void main(String[] args) throws EmployeeNotFoundException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        String name = employeeDAO.getEmployeeNameById(3);
        System.out.println("done");
    }
}

class EmployeeDAO {
    public String getEmployeeNameById(int id) throws EmployeeNotFoundException {
        DBConnection dbConnection = null;
        try {
            dbConnection = getConnection();
            //.....
        } catch (SQLException e) {
            //0. Logging
            //1. Return default
            //2. Retrying
            //3. Fail-over
            throw new EmployeeNotFoundException("Can't ", e);
        } finally {
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("done...");
        return "";
    }

    //@Retryable(timeout = 10_000, count = 10)
    private DBConnection getConnection() throws SQLException {
        throw new SQLException("RRRRR");
    }
}
