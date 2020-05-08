package com.company.kg.geektech.lesson8.players;

public class Golem  extends  Hero{

    public Golem(int health, int damage) {
        super(health, damage, HavingSuperAbilities.DEFENCE);
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {

       for (int i = 0;i < heroes.length;i++) {
            if (heroes[i].getHealth()>0){
            heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage()/3);
        }
        }
    }

}
