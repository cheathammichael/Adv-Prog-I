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
public class WageEmployee extends Employee{
    //weekly pay, wage times hour
    //hour
    //wage
    
        private double wage;

    public WageEmployee(double wage, double hours, String firstName, String lastName) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }

 

    /**
     * Get the value of wage
     *
     * @return the value of wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * Set the value of wage
     *
     * @param wage new value of wage
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

    private double hours;

    /**
     * Get the value of hours
     *
     * @return the value of hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * Set the value of hours
     *
     * @param hours new value of hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double computePay() {
        return this.wage * this.hours;
    }

    @Override
    public String toString() {
                String s = super.toString();
        return s + "\n" + "WageEmployee: " + "salary=" + this.wage + " " + "hours=" + this.hours;
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
        final WageEmployee other = (WageEmployee) obj;
        if (Double.doubleToLongBits(this.wage) != Double.doubleToLongBits(other.wage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hours) != Double.doubleToLongBits(other.hours)) {
            return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        
        WageEmployee e1 = new WageEmployee(20.75, 40, "John", "Green");
        WageEmployee e2 = new WageEmployee(11.50, 50, "Mary", "Brown");
        WageEmployee e3 = new WageEmployee(44.25, 11.0, "John", "Green");
        
        System.out.println(e1);
        System.out.println("");
        
        System.out.println(e2);
        System.out.println("");
        
        System.out.println(e3);
        System.out.println("");
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e1));
        System.out.println(e1.computePay());
        System.out.println(e1.equals(new Object()));
        
        
        
    }
}
