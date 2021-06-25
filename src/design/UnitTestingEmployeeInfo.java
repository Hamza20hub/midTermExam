package design;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class UnitTestingEmployeeInfo  {


    //Write Unit Test for all the methods has been implemented in this package.
    @Test
    public void testEmployeeId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease Enter ID Number : ");
        int eId = scanner.nextInt();
        Assert.assertEquals( "str","");
    }
    @Test
    public void testEmployeeName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Employee Name: ");
        String eName = scanner.next();
    }


    public static void main(String[] args) {



        System.out.println(FortuneEmployee.calculateEmployeePension());
        Assert.assertEquals("ACTUAL", "EXPECTED");


    }

}

