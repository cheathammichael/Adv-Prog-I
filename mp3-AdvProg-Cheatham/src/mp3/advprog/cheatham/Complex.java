/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3.advprog.cheatham;

/**
 *
 * @author novem
 */
import java.util.Scanner;
public class Complex {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    @Override
    public String toString() {
        if (this.b == 0)
            return "(" + a + ")";
        return  a + " + " + b + "i";
    }
    
 public double getRealPart()
 {
     return this.a;
 }
    
 public double getImaginaryPart()
 {
     return this.b;
 }
 
 public Complex add(Complex f)
 {
     double a = this.a + f.a; 
     double b = this.b + f.b;
     Complex temp = new Complex(a, b);
     
     return temp;
 }
 
 public Complex subtract(Complex f)
 {
     double a = this.a - f.a; 
     double b = this.b - f.b;
     Complex temp = new Complex(a, b);
     
     return temp;
 }
 
 public Complex multiply(Complex f)
 {
     double a = this.a;
     double b = this.b;
     double c = f.a;
     double d = f.b;
     double g = ((a*c) - (b*d)); 
     double h = ((b*c) + (a*d));
     Complex temp = new Complex(g, h);
     return temp;
 }
 
 public Complex divide(Complex f)
 {
     double a = this.a;
     double b = this.b;
     double c = f.a;
     double d = f.b;
     double g = ((a*c) + (b*d))/((Math.pow(c, 2)) + (Math.pow(d, 2))); 
     double h = ((b*c) - (a*d))/((Math.pow(c, 2)) + (Math.pow(d, 2)));
     Complex temp = new Complex(g, h);
     return temp;
 }
 
 public double abs()
 {
     return Math.sqrt(Math.pow(this.a, 2) + Math.pow(b, 2));
 }
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);     
         System.out.print("Enter the first complex number: ");     
         double a = input.nextDouble();     
         double b = input.nextDouble();     
         Complex e1 = new Complex(a, b);     
         System.out.print("Enter the second complex number: ");     
         double c = input.nextDouble();     
         double d = input.nextDouble();     
         Complex e2 = new Complex(c, d);
        
        System.out.println("(" + e1.toString() + ") + (" + e2.toString() + ") = " + e1.add(e2));
        System.out.println("(" + e1.toString() + ") - (" + e2.toString() + ") = " +e1.subtract(e2));
        System.out.println("(" + e1.toString() + ") * (" + e2.toString() + ") = " +e1.multiply(e2));
        System.out.println("(" + e1.toString() + ") / (" + e2.toString() + ") = " +e1.divide(e2));
        System.out.println("|" + e1 + "| = " + e1.abs()); 
        System.out.println(e1.getRealPart());
        System.out.println(e1.getImaginaryPart());
    }
}
