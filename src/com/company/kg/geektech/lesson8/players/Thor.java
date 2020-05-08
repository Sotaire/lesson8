package com.company.kg.geektech.lesson8.players;

import java.util.Random;

public class Thor extends Hero{

    public Thor(int health, int damage) {
        super(health, damage, HavingSuperAbilities.CRID);
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {

        for (int i = 0;i < heroes.length;i++) {
            if (this == heroes[i]){
                if (heroes[i].getHealth()>0){
                Random random3 = new Random();
                int critical3 = random3.nextInt(4)+1;
                if (critical3 == 2){
                    boss.setDamage(0);
        }

                }
            }
        }

    }

}
