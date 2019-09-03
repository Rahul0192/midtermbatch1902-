package CalcuateSalary;

import java.sql.*;
import java.util.Scanner;
/**
 * @author Jahidul Islam
 * This class should have all the method necessary to calculate salary of 10 employees
 * Create employees table in MySQL Database and store employees information in that table
 * Use db package to get helper methods to connect to db and read employees information
 * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
 * This class consists only helper methods, you should not declare any main method here.
 * Main method is being declared in App class
 * */

public class SalaryCalulator {

    public   void mySqlConnection() throws ClassNotFoundException, SQLException {
        String userName="root";
        String password="";
        String url= "jdbc:mysql://localhost:3306/classicmodels ?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName,password);
        Statement statement=  connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from employees");
        resultSet.next();
        String name=resultSet.getString("country");
        System.out.println(name);

    }

    public String employee() {
        String name;
        int perHour,hour,weeklyIncome,yearlyIncome,tax;


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Employee name");
      name= scanner.nextLine();
        System.out.println("How much is the Per hour");
        perHour=scanner.nextInt();
        System.out.println("Weekly Hours");
        hour=scanner.nextInt();

        tax=perHour * hour/100*35;
        System.out.println(" Weekly income");

        weeklyIncome=perHour * hour-tax;
        System.out.println(weeklyIncome);
        System.out.println(" Yearly Net Income");
       yearlyIncome=weeklyIncome*52;
        System.out.println(yearlyIncome);

        return name;
    }
}



