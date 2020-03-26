package weapons;

import actions.IWeapon;
import enemies.Enemy;
import players.Player;

public abstract class Weapon implements IWeapon {

    //instance vars
    private int damageValue;

    //constructor
    public Weapon(int damageValue){
        this.damageValue = damageValue;
    }

    //method
    public void attack(Player player, Enemy enemy){
        enemy.getHealthPoints() -= this.damageValue;
    }


    //getters


    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
