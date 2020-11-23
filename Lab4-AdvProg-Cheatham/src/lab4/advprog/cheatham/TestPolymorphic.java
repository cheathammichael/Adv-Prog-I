/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4.advprog.cheatham;

import java.util.ArrayList;

/**
 *
 * @author novem
 */
public class TestPolymorphic {
    
    public static void printPay(Employee e)//in parameters as well, can assign sub to super
    {
        System.out.println(e.computePay());
    }
    
     public static void printPay(Employee[] ar)//in parameters as well, can assign sub to super
    {
        for (Employee e: ar)
            System.out.println(e.computePay());
    }
     
     public static void printPay(ArrayList<Employee> ar)//in parameters as well, can assign sub to super
    {
        for (Employee e: ar)
            System.out.println(e.computePay());
    }
    
    public static void main(String[] args) {
        
        Employee e1 = new WageEmployee( 8.75, 40, "John", "White");//polymorphism
        SalaryEmployee e2 = new SalaryEmployee( "John", "White", 40000);//standard
        //e2 = (SalaryEmployee)e1;//Always assign sub to super. This will crash at runtime
        
        
        printPay(e1);
        printPay(e2);
        
        Employee[] arEmployee = new Employee[2];//super array can accept values of both subs
        arEmployee[0] = new WageEmployee(55.55, 40, "Mary", "Poppins");
        arEmployee[1] = new SalaryEmployee("Al", "Pacino", 1000000);
        
        printPay(arEmployee);
        
        ArrayList<Employee> listEmployee = new ArrayList();
        
        listEmployee.add(arEmployee[0]);
        listEmployee.add(new SalaryEmployee( "Robert", "Deniro", 2000000 ));
        
        printPay(listEmployee);
        //double the input pay for manager
        //add to group adds employees that the manager manages
        //remove from group removes from. both are boolean. return true.
    }
}
