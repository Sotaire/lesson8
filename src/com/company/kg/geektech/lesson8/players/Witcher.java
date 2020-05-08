package com.company.kg.geektech.lesson8.players;


public class Witcher extends Hero {

    public Witcher(int health, int damage) {
        super(health, damage, HavingSuperAbilities.SPELL);
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[6].getHealth()>0){
            if(heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(heroes[i].getHealth() + heroes[6].getHealth());
                heroes[6].setHealth(0);
            }
            }
            }

        }
    }


