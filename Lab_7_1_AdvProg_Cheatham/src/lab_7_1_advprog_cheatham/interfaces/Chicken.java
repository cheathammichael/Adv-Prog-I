/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_7_1_advprog_cheatham.interfaces;

/**
 *
 * @author novem
 */
public class Chicken extends Animal
implements Edible{

    
    
    @Override
    public String sound() {
    return "Chicken: cock-a-doodle-door";  
    }

    @Override
    public String howToEat() {
    return "Chicken: Fry it";  
    }
    
}
