package design;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class EmployeeInfo implements Employee {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;


    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */

    public EmployeeInfo() {

    }
    public EmployeeInfo(int employeeId) {
        List<Integer> id = new ArrayList<>();
        id.add(001);
        id.add(002);
        id.add(003);
        id.add(004);
        id.add(005);

    }

    public EmployeeInfo(String name, int employeeId) {
        Map<Integer, String> ei = new HashMap<>();
        ei.put(001, "Rahman");
        ei.put(002, "Rahim");
        ei.put(003, "iqbal");
        ei.put(004, "Sami");
        ei.put(005, "Azhar");

    }



    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     */


    public int calculateEmployeeBonus(int numberOfYearsWithCompany) {
        double bestPerBonus = numberOfYearsWithCompany * monthlySalary() / 0.10;
        return (int) bestPerBonus;
    }


    public int monthlySalary() {
        int monthlySalary = calculateSalary() * 4;
        return monthlySalary;

    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */

    public static int calculateEmployeePension() {
 EmployeeInfo em = new EmployeeInfo();


        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        LocalDate joiningDate = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt() );
        LocalDate todaysDate = LocalDate.now();
         int years = Period.between(joiningDate,todaysDate).getYears();
         if (years==1|| years<1){
             double pension= years*em.monthlySalary()/0.05;
         }else {
             System.out.println("not eligible for pension");
         }if (years==2 || years <3){
            double pension= years*em.monthlySalary()/0.10;
        }else if (years>3){
            double pension= years*em.monthlySalary()/0.12;
        }

//        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
//        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        //Calculate pension


        return total;
    }

    @Override
    public int employeeId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease Enter ID Number : ");
        int eId = scanner.nextInt();
        return 0;
    }

    @Override
    public String employeeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Employee Name: ");
        String eName = scanner.next();
        return null;
    }

    @Override
    public void assignDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Department: ");
        String Dept = scanner.next();


    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    //@Override
    public int calculateSalary(int totalHours, int payRate) {
        int salary = (totalHours * payRate);
        return salary;

    }


    @Override
    public int benefitLayout() {
        double benefit = calculateSalary() / .12;
        return (int) benefit;
    }

    @Override
    public void calculateEmployeeBonus() {

    }

    public int averageBonus() {
        double avgBonus = calculateSalary() / 0.8;
        return (int) avgBonus;
    }

    private static class DateConversion {

        public DateConversion(Months months) {

        }


        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth (String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}

