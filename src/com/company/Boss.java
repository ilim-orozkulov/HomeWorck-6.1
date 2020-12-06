package com.company;


public class Boss extends GameAntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "weapon=" + weapon +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
