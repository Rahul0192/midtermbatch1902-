package CalcuateSalary;

import java.sql.SQLException;

/**
 * @author Jahidul Islam
 * Use methods from the SalaryCalculator class to calculate salary of an employee
 *
 * */
public class App {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        SalaryCalulator salaryCalulator= new SalaryCalulator();
        salaryCalulator.employee();
        salaryCalulator.mySqlConnection();

    }
}
