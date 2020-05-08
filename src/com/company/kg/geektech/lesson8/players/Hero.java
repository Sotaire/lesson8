package com.company.kg.geektech.lesson8.players;

public abstract class Hero extends GameEntity implements AbilityType{

    private HavingSuperAbilities AbilityType;

    public Hero(int health, int damage, HavingSuperAbilities abilityType) {
        super(health, damage);
        this.AbilityType = abilityType;
    }
}
