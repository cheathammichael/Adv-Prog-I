/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp4.advprog.cheatham;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author novem
 */
public class Mp4AdvProgCheatham {

     public static ArrayList<Integer> getPrimeFactors(int n)
    {
        ArrayList<Integer> primeFactors = new ArrayList();
        
        while (n % 2 == 0)
        {
            primeFactors.add(2);
            n /= 2;
        }
        
        for (int i = 3; i <= n; i += 2)
        {
            while (n % i == 0)
            {
                primeFactors.add(i);
                n /= i;
            }
        }
        
        return primeFactors;
    }
     
     public static int perfectSquare(ArrayList a)
     {
         ArrayList<Integer> a1 = new ArrayList();
         int b = 0;
         int count = 0;
         int count2 = 0;
         int result = 1;
         for (int i = 0; i < a.size(); i++)
         {
             b = (int)a.get(i);
                for (int j = 0; j < a.size(); j++)
                {
                    if ( b == (int)a.get(j))
                    {
                        count++;
                    }
                }                
                if ((count % 2 != 0))
                {                   
                    for ( int k = 0; k < a1.size(); k++)
                    {
                        if (b == a1.get(k))
                            count2++;
                    }
                    if (count2 == 0)
                        a1.add(b);                    
                }
                count = 0;
         }         
         for (int i = 0; i < a1.size() ; i++)
         {
             result = result * (int)a1.get(i);
         }
         return result;
     }
     
     
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m;
        while (true)
        {
        System.out.println("Enter an integer m: ");
        String l = scan.next();
        try{
            m = Integer.parseInt(l);
            break;
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Improper input!");
        }
        }
        ArrayList<Integer> a1 = getPrimeFactors(m);
        int n = perfectSquare(a1);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }
    
    
}
