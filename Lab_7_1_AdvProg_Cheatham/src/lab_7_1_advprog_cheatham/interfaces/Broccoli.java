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
public class Broccoli extends Fruit
implements Edible
{

    @Override
    public String howToEat() {
    return "Broccoli: Steam it";    
    }
    
}
