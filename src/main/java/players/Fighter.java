package players;

import actions.IWeapon;
import enemies.Enemy;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {

    //instance vars:
    private ArrayList<Weapon> allFightersWeapons;

    // constructor
    public Fighter(String name, int healthPoints){
        super(name, healthPoints);
        this.allFightersWeapons = new ArrayList<Weapon>();
    }


    //methods
    public void addWeaponToFighter(Weapon weapon){
        allFightersWeapons.add(weapon);
    }

    public Weapon switchWeapon(())
    //finish


    public void attack(Enemy enemy){
        enemy.getHealthPoints() = int hp ;
        hp -= bag.
    }







}
