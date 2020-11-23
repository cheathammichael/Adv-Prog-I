/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_7_1_advprog_cheatham;

import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author novem
 */
public class House implements Cloneable, Comparable<House> {

    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of ID
     *
     * @param id new value of ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public double getArea() {
        return area;
    }

    /**
     * Set the value of Area
     *
     * @param area new value of area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Get the value of whenBuilt
     *
     * @return the value of whenBuilt
     */
    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    /**
     * Set the value of whenBuilt
     *
     * @param whenBuilt new value of whenBuilt
     */
    public void setWhenBuilt(Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + id + ", area=" + area + ", whenBuilt=" + whenBuilt + '}';
    }

    @Override
    /**
     * Override the protected clone method defined in the Object class, and
     * strengthen its accessibility
     */
    public Object clone() {
        House house = null;
        try {
            house = (House) super.clone();
            house.whenBuilt = (Date) this.whenBuilt.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        return house;
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(House o) {

        if (this.getId() == o.getId() && 
            this.getArea() == o.getArea() &&
            this.getWhenBuilt().equals(o.getWhenBuilt()))
            return 0;
         
        if (this.area > o.area) 
            return 1;
         
        else if (area < o.area) 
            return -1;
         
        else 
            return -2;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) {return false;}
        if (getClass() != obj.getClass()) {return false;}
        final House other = (House) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (this.whenBuilt != other.whenBuilt) {
            return false;
        }
        return true;
    }

    
    public static void main(String[] args)
            throws CloneNotSupportedException {
        House house1 = new House(1, 1000);
        House house2 = (House) house1.clone();
        System.out.println(house1);
        System.out.println(house2);
        House house3 = new House( 3, 2000);
        House house4 = new House( 4, 2000);
        house1.compareTo(house2);
        System.out.println("house 1 house 2 are identical: " + house1.compareTo(house2));
        System.out.println("house 3 house 4 have same area: " + house3.compareTo(house4));
        System.out.println("house 4 is larger than house 2: " + house4.compareTo(house2));
        
        System.out.println("house 1 house 2 are EQUAL: " + house1.equals(house2));
        System.out.println("house 2 house 3 are EQUAL: " + house2.equals(house3));
    }
}
