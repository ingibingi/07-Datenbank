import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/scott","root","");

        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");

        int count = 0;
        while (resultSet.next()) {
            Employee newEmployee = new Employee(resultSet);
            newEmployee.printEmpInfo();
            count++;
        }
    }
}