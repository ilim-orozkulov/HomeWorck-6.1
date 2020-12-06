package com.company;

public class Main {


        public static void main(String[] args){
            Weapon weapon = new Weapon();

            weapon.setType("Avtomat");

            weapon.setName("AK-47");

            Boss boss = new Boss();

            boss.setHealth(500);

            boss.setDamage(50);

            boss.setWeapon(weapon);



            System.out.println(weapon.toString() + boss.toString());
        }
    }

