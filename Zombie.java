/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Zombie implements Destroyable{
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
 
    }
    public void destroyed(){
    }
    
    public String getZombieInfo(){
        return "Health = "+health+"\nLevel = "+level+"\n";
        
    }
}
