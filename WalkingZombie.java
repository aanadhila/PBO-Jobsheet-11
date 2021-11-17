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
public class WalkingZombie extends Zombie{

    public WalkingZombie(int health, int level) {
        super(health,level);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n"+ super.getZombieInfo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroyed() {
        health-=health*20/100;
    }

    @Override
    public void heal() {
        switch(level){
            case 1:health*=1.1;break;
            case 2:health*=1.3;break;
            case 3:health*=1.4;break;
        }
    }
    
}
