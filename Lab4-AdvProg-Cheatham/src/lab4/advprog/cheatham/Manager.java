/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4.advprog.cheatham;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author novem
 */
public class Manager extends SalaryEmployee {

ArrayList<Employee> manages = new ArrayList();

    public Manager(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);    
        this.setSalary(2 * this.getSalary());
    }

    public ArrayList<Employee> getManages() {
        return manages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (! super.equals(obj))
            return false;
        final Manager other = (Manager) obj;
        if (!Objects.equals(this.manages, other.manages)) {
            return false;
        }
        return true;
    }

    @Override
    public double computePay() {
        return (this.getSalary() /12) * 2;
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        return s + "\n" + "Manages: " + manages + '}';
    
}

    public boolean addToGroup(Employee e)
    {
        this.manages.add(e);
        
        if (this.manages.contains(e))
            {
                System.out.println("The employee " + e.getFirstName() + e.getLastName() + " was added");
                return true;
            }
        else
            {
                System.out.println("The employee " + e.getFirstName() + e.getLastName() + " was not added");
                return false;
            }
    }
    
    public boolean removeFromGroup(Employee e)
    {
        if (! this.manages.contains(e))
        {
            System.out.println("The employee was not found!");
            return false;
        }
        
        this.manages.remove(e);
        
        if (this.manages.contains(e))
            {
                System.out.println("The employee " + e.getFirstName() + e.getLastName() + " was not removed.");
                return false;
            }
        else
            {
                System.out.println("The employee " + e.getFirstName() + e.getLastName() + " was removed.");
                return true;
            }
    }

    public static void main(String[] args) {
        
        Employee e = new WageEmployee(9.75, 40, "Kevin", "Bacon");
        Employee e1 = new SalaryEmployee("Elizabeth", "Taylor", 75000);
        Manager e2 = new Manager("John", "Breaux", 25000);
        
        e2.addToGroup(e);
        e2.addToGroup(e1);
        System.out.println("");
        System.out.println(e2.manages);
        System.out.println(e2);
        System.out.println("");
        e2.removeFromGroup(e1);
        System.out.println("");
        System.out.println(e2);
    }
    
}

