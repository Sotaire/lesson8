package com.company.kg.geektech.lesson8.players;

import java.util.Random;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, HavingSuperAbilities.CRITICAL_DAMAGE);
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {

       for (int i = 0;i < heroes.length;i++){
            if (this == heroes[i]){
                 Random random = new Random();
                 int critical = random.nextInt(2)+1;
                System.out.println(critical);
                      heroes[i].setDamage(heroes[i].getDamage() * critical);
                      break;
            }
        }
    }
}
