package design;

public class FortuneEmployee extends EmployeeInfo {

    public FortuneEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     *
     * Use any databases[ Oracle, MySql] to store data and retrieve data.
     *
     **/
    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.employeeId();
        employeeInfo.employeeName();
        employeeInfo.assignDepartment();
        employeeInfo.calculateSalary();
        employeeInfo.monthlySalary();
        employeeInfo.benefitLayout();
        employeeInfo.calculateEmployeeBonus();
        employeeInfo.averageBonus();
        System.out.println(calculateEmployeePension());


        System.out.println("Employee ID # " + employeeInfo.employeeId() +
                "Employee Name : " + employeeInfo.employeeName() );
    }

    }


