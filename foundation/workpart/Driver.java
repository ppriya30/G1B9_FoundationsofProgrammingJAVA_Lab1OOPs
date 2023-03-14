package com.lab1.oops.foundation.workpart;
import com.lab1.oops.foundation.Employee;
import com.lab1.oops.foundation.view.ImpleShowDetail;

import java.util.Scanner;

public class Driver {

    public void display1(){
        System.out.println("please enter the department from the following ");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Hr");
        System.out.println("4.Legal");
        System.out.println("Enter your choice");
        Scanner sc1= new Scanner(System.in);
        int choice= sc1.nextInt();

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Employee emp1= new Employee();
        System.out.println("Enter first name");
        String name1= sc.nextLine();
        System.out.println("enter last name");
        String name2= sc.nextLine();
        emp1.setFirstname(name1);
        emp1.setLastname(name2);
        Employee emp = new Employee(name1,name2);
        ImpleShowDetail imp = new ImpleShowDetail();
        Driver driver=new Driver();
        String pass="";
        String mail="";

        System.out.println("please enter the department from the following ");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Hr");
        System.out.println("4.Legal");
        System.out.println("Enter your choice");
        Scanner sc1= new Scanner(System.in);
        int choice= sc.nextInt();
        switch (choice) {
            case 1:
                mail = imp.genemail(emp.getFirstname().toLowerCase(), emp.getLastname().toLowerCase(), "tech");
                break;
            case 2:
                mail = imp.genemail(emp.getFirstname().toLowerCase(), emp.getLastname().toLowerCase(), "admin");
                break;
            case 3:
                mail = imp.genemail(emp.getFirstname().toLowerCase(), emp.getLastname().toLowerCase(), "hr");
                break;
            case 4:
                mail = imp.genemail(emp.getFirstname().toLowerCase(), emp.getLastname().toLowerCase(), "legal");
                break;
            default:
                System.out.println("Not a valid input so output is without Email Id");

        }

        pass=imp.genpasword();
        emp.setEmail(mail);
        emp.setPasword(pass);
        System.out.println("Dear "+emp.getFirstname()+" your generated credentials are as follows");
        imp.personaldetail(emp);



    }

}

