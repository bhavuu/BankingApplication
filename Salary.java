package com.bhavya;
import java.util.Scanner;
import java.util.function.Function;

public class Salary {




    public  static void EnterSalary() {
        int   salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic salary ");
        salary = sc.nextInt();


        double Hra = 0.1 * salary;
        double DearnessAllowance = 0.1 * salary;

        double Gross = Hra + DearnessAllowance + salary;

        double PFDeduct = 0.1 * salary;

        double NetSalary = Gross - PFDeduct;

        double AnnualPackage = 12 * Gross - (12 * PFDeduct);
        System.out.println("HRA" + Hra);
        System.out.println("Dearness Allowance" + DearnessAllowance);
        System.out.println("Gross salary" + Gross);
        System.out.println("Net Salary" + NetSalary);
        System.out.println("Annual package " + AnnualPackage);

    }


    public static void main(String[] args)
    {
        EnterSalary();




        //System.out.println("Dearness Allowance" + Dea);
    }
}
