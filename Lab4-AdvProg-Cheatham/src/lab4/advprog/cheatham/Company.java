/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4.advprog.cheatham;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author novem
 */
public class Company {
    
        private ArrayList<Employee> employees = new ArrayList();

    /**
     * Get the value of employees
     *
     * @return the value of employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Set the value of employees
     *
     * @param employees new value of employees
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee( Employee e)
    {
        employees.add(e);
    }
    /**It removes an employee from the company IF the employee exists
     * 
     * @param e the employee to remove
     * @return the removed employee
     */
    public Employee removeEmployee(Employee e)
    {
        int index = employees.indexOf(e);
        
        if ( index == -1 )
            return null;
        
        Employee eToremove = employees.get(index);
        employees.remove(index);
        return eToremove;
        //standard to return what we remove, if you don't find what you remove
        //return null
        //if (employees.contains(e))
       //{
         //   employees.remove(e);
        //}
        //return e;
    }

    @Override
    public String toString() {
        return "Company{" + "employees=" + employees + '}';
    }
    
    public static void sortByName(Company c)
    {
    int l = 0;
        System.out.println();
    for (int i = 0; i < c.employees.size();i++)
            for (int j = 1; j < c.employees.size(); j++)
            {
                if ((c.employees.get(i).getLastName().charAt(0) > (c.employees.get(j).getLastName().charAt(0))))
                    Collections.swap(c.employees, i, j);
                
                
                if ((c.employees.get(i).getLastName().charAt(0) == (c.employees.get(j).getLastName().charAt(0))))
                {
                    if (c.employees.get(i).getLastName().length() <= c.employees.get(j).getLastName().length())
                    {
                        for (int k = 0; k < c.employees.get(i).getLastName().length(); k++, l++)
                        {
                            if((c.employees.get(i).getLastName().charAt(k) > c.employees.get(j).getLastName().charAt(l)) )
                            { 
                                Collections.swap(c.employees, i, j);
                                l = 0;
                                break;
                            }
                        }
                        l = 0;
                    }
                    else if (c.employees.get(i).getLastName().length() > c.employees.get(j).getLastName().length())
                    {
                        for (int k = 1; k < c.employees.get(j).getLastName().length(); k++, l++)
                        {
                            if((c.employees.get(i).getLastName().charAt(k) > c.employees.get(j).getLastName().charAt(l)) )
                            { 
                                Collections.swap(c.employees, i, j);
                                l = 1;
                                break;
                            }
                        }
                    l = 1;
                    }
                }
               }
        for (int i = 0, j = 1; j < c.employees.size(); i++, j++)
        {
            if ((c.employees.get(i).getLastName().charAt(0) > (c.employees.get(j).getLastName().charAt(0))))
                    Collections.swap(c.employees, i, j);
        }
        if ((c.employees.get(0).getLastName().charAt(0) < (c.employees.get(c.employees.size() -1).getLastName().charAt(0))))
                    Collections.swap(c.employees, 0, c.employees.size() -1);
        
        for (int i = 0; i < c.employees.size() -1; i++)
        {
            if (c.employees.get(i).getLastName().compareTo(c.employees.get(i+1).getLastName())==0)
            {
                if ((c.employees.get(i) instanceof WageEmployee == true)&&(c.employees.get(i+1) instanceof WageEmployee == true))
                {
                    Employee e = c.employees.get(i);
                    Employee f = c.employees.get(i+1);
                    if (((WageEmployee)e).getWage() > ((WageEmployee)f).getWage())
                    {
                        Collections.swap(c.employees, i, i+1);
                   }
                        }
                if ((c.employees.get(i) instanceof SalaryEmployee == true)&&(c.employees.get(i+1) instanceof SalaryEmployee == true))
                {
                    Employee e = c.employees.get(i);
                    Employee f = c.employees.get(i+1);
                    if (((SalaryEmployee)e).getSalary() > ((SalaryEmployee)f).getSalary())
                    {
                        Collections.swap(c.employees, i, i+1);
                    }
                }           
            }   
        }
        Collections.reverse(c.employees);
    }       
    
    public static void main(String[] args) {
        Company c = new Company();
         
        Employee e1 = new SalaryEmployee("John", "White", 20000);//polymorphism
        SalaryEmployee e2 = new SalaryEmployee( "Jim", "White", 40000);//standard
        c.addEmployee(e1);
        c.addEmployee(e2);
        System.out.println(c);
        System.out.println("");
        System.out.println(c.removeEmployee(e1));
        System.out.println(c.removeEmployee(new WageEmployee( 8.75, 40, "Paul", "White")));
        Employee e3 = new WageEmployee(9.75, 40, "Kevin", "Bacon");
        Employee e4 = new SalaryEmployee("Elizabeth", "Taylor", 75000);

        
        Manager e6 = new Manager("Todd", "White", 35000);
        System.out.println(e6);
        e6.addToGroup(e1);
        e6.addToGroup(e2);
        
        c.employees.clear();
        SalaryEmployee e8 = new SalaryEmployee("John", "Breaux", 25000);
        Employee e7 = new WageEmployee(10.75, 40, "Tim", "Bacon");
        c.addEmployee(e4);
        c.addEmployee(e3);
        c.addEmployee(e2);
        c.addEmployee(e8);
        c.addEmployee(e6);
        c.addEmployee(e7);
       
        System.out.println(c);
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Now the after the sort method: ");
        System.out.println("-------------------------------------------------------");
        sortByName(c);
        System.out.println("");
        int j = c.employees.size();
        for (int k = 0; k < j; k++)
        {
            System.out.println(c.employees.get(k));
            System.out.println("");
        }
        
        //typecast as 
    }
}
//intanceof

