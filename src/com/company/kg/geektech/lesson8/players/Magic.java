package com.company.kg.geektech.lesson8.players;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, HavingSuperAbilities.BOOST);
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {

       for (int i = 0;i < heroes.length;i++) {
           if (heroes[i].getHealth() > 0){
           heroes[i].setDamage(heroes[i].getDamage() + 5);
           }
        }
    }
}