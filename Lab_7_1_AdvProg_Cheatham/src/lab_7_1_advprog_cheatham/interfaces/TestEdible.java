/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_7_1_advprog_cheatham.interfaces;

import java.util.ArrayList;

/**
 *
 * @author novem
 */
public class TestEdible {
    
    public static void testWithArrayList()
    {
        ArrayList<Edible> edible = new ArrayList<>();
        
        edible.add(new Chicken());
        edible.add(new Apple());
        edible.add(new Orange());
        edible.add(new Duck());
        edible.add(new Broccoli());
        for (Edible eat: edible)
            System.out.println(eat.howToEat());
        
    }
    
    public static void testWithArrayOfInterfaces()
    {
        Edible[] edible =
        {
            new Chicken(), new Apple(), new Orange(), new Duck(), new Broccoli()
        };
        for (int i = 0; i < edible.length; i++)
        {
            System.out.println(edible[i].howToEat());
        }
    }
    
    public static void testWithArrayOfObjects()
    {
        Object[] objects =
        {
            new Tiger(), new Chicken(), new Apple(), new Duck(), new Broccoli() 
        };
        for (int i  = 0; i < objects.length; i++)
        {
            if (objects[i] instanceof Edible)
            {
                System.out.println(((Edible)objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal)
            {
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
    public static void main(String[] args) {
        testWithArrayOfObjects();
        System.out.println("-------------------------");
        testWithArrayOfInterfaces();
        System.out.println("-------------------------");
        testWithArrayList();
    }
    
}
