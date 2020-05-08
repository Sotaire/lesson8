package com.company.kg.geektech.lesson8.players;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, HavingSuperAbilities.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void abilitySuperAbility(Boss boss, Hero[] heroes) {

       for (int i = 0;i < heroes.length;i++){
                 if (this == heroes[i])
                    heroes[i].setDamage(heroes[i].getDamage()+boss.getDamage());
                }
            }
        }



