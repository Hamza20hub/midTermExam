package parser;

import org.testng.annotations.Test;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        //Done

Student student=new Student();

        Student xml = new Student();


        System.out.println( xml.getFirstName());
        System.out.println( xml.getLastName());
        System.out.println(xml.getId());
        System.out.println(xml.getScore());


    }

}
