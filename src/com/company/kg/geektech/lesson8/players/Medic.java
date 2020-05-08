package com.company.kg.geektech.lesson8.players;

public class Medic extends Hero {

    private  int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, HavingSuperAbilities.HEALS);
        this.healPoints = healPoints;
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {

        for (int i = 0; i<heroes.length; i++){
            if (this != heroes[i] && heroes[i].getHealth() > 0){
            heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }

    }
}
