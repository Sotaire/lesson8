package com.company.kg.geektech.lesson8.field;

import com.company.kg.geektech.lesson8.players.*;

public class RPG_Game {

    private static int counter;

    public static void startGame(){

        Boss boss = new Boss(3000,80);

        Warrior warrior = new Warrior(250,15);
        Medic medic = new Medic(200,5,10);
        Hunter hunter = new Hunter(240,20);
        Magic magic = new Magic(100,25);
        Thor thor = new Thor(200,10);
        Golem golem = new Golem(300,10);
        Witcher witcher = new Witcher(200,0);

        Hero[] heroes = {warrior,magic,medic,hunter,thor,golem,witcher};

        statistics(boss,heroes,"Перед началом раунда");

        while (!isFinished(boss,heroes)){
            round(boss,heroes);
        }

    }

    private static void round(Boss boss,Hero[] heroes){

        counter++;
        if (boss.getHealth()>0){
        bossHit(boss,heroes);
        }
        heroesSuperAbilities(boss,heroes);
        heroesHit(boss,heroes);
        statistics(boss,heroes,"Round "+counter);

    }

    public static void statistics (Boss boss,Hero[] heroes,String round_name){

        System.out.println(round_name + "__________________");
        System.out.println("-------------------------------");
        System.out.println("Boss health: " + boss.getHealth());
        for (int i = 0;i<heroes.length; i++){
            System.out.println(heroes[i].getClass().getSimpleName() + " health: " + heroes[i].getHealth());
        }
        System.out.println("-------------------------------");

    }



    private static void bossHit (Boss boss,Hero[] heroes){

        for (int i = 0;i<heroes.length;i++){
            if (heroes[i].getHealth() > 0)
                if (heroes[i].getHealth() - boss.getDamage() < 0){
                    heroes [i].setHealth(0);
                }else{
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
             }
        }

    }

    private static void heroesHit (Boss boss,Hero[] heroes){

        for (int i = 0;i<heroes.length;i++){
            if (heroes[i].getHealth()>0){
                if (boss.getHealth() - heroes[i].getDamage() < 0 ){
                    boss.setHealth(0);
                }else {
                    boss.setHealth(boss.getHealth() - heroes[i].getDamage());
                }
            }
        }

    }

    private static boolean isFinished(Boss boss,Hero[] heroes){

        if (boss.getHealth() <= 0){
            System.out.println("Heroes Won!");
            return true;
        }

        boolean allHeroesHealth = true;
        for (int i = 0; i<heroes.length; i++){
            if (heroes[i].getHealth() > 0 ){
                allHeroesHealth = false;
                break;
            }
        }

        if (allHeroesHealth){
            System.out.println("Boss won!");
        }

        return allHeroesHealth;
    }

   public static void heroesSuperAbilities (Boss boss,Hero[] heroes){

        for (int i = 0;i<heroes.length;i++){
            if (heroes[i].getHealth() > 0){
                heroes[i].abilitySuperAbility(boss,heroes);
            }
        }

    }

}
