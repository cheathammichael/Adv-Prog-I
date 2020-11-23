/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4.advprog.cheatham;

/**
 *
 * @author novem
 */
public class SalaryEmployee extends Employee {

    private double salary;

    public SalaryEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //override get salary   
    @Override
    public double computePay() {
        return this.salary /12;
    }

    @Override
    public String toString() {
        
        String s = super.toString();
        return s + "\n" + "SalaryEmployee: " + "salary=" + salary + '}';
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
        
        final SalaryEmployee other = (SalaryEmployee) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        SalaryEmployee e1 = new SalaryEmployee("John", "Green", 50000);
        SalaryEmployee e2 = new SalaryEmployee("Mary", "Brown", 60000);
        SalaryEmployee e3 = new SalaryEmployee("John", "Green", 100000);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e1));
        System.out.println(e1.computePay());
        System.out.println(e1.equals(new Object()));
        
        
    }
    
}
