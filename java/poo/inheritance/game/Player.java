package poo.inheritance.game;

import poo.inheritance.game.enums.EAttributes;

public class Player {
  protected String name;
  public int level = 1;
  protected double lifePoints = 100;
  protected double strength = 1;
  protected double mana = 50;
  protected double magicFactor = 1;
  protected double defendFactor = 1;
  protected int xpToNextLevel = 1000;
  protected int currentXp = 0;

  public Player(String name) {
    this.name = name;
  }

  public Player(String name, double lifePoints, double strength, double mana, double magicFactor, double defendFactor) {
    this.name = name;
    this.lifePoints = lifePoints;
    this.strength = strength;
    this.mana = mana;
    this.magicFactor = magicFactor;
    this.defendFactor = defendFactor;
  }

  public boolean attack(Player opponent) {
    double attackPower = ((this.strength * 10) * (this.level - ((this.level - 1) / 10)));
    opponent.lifePoints -= opponent.deffend(attackPower);
    if (opponent.lifePoints <= 0) {
      opponent.die(this);
    }
    return true;
  }

  public double deffend(double damage) {
    return (damage / (defendFactor * (this.level - ((this.level - 1) / 10))));
  }

  public boolean upLevel(int xpDifference) {
    this.level += 1;
    this.currentXp = xpDifference;
    this.xpToNextLevel += (int) Math.round((this.xpToNextLevel / 2) * (this.level * 1500));
    return true;
  }

  public boolean upgradeHabillity(EAttributes attribute) {
    switch (attribute) {
      case lifePoints:
        this.lifePoints += 1;
        break;
      case strength:
        this.strength += 1;
        break;
      case mana:
        this.mana += 1;
        break;
      case magicFactor:
        this.magicFactor += 1;
        break;
      case defendFactor:
        this.defendFactor += 1;
        break;
      default:
        return false;
    }
    return true;
  }

  public boolean gainXp(int xp) {
    this.currentXp += xp;
    if (this.currentXp >= this.xpToNextLevel) {
      int xpDifference = this.currentXp - this.xpToNextLevel;
      this.upLevel(xpDifference);
    }
    return true;
  }

  public boolean die(Player opponent) {
    int xpFactor = (int) Math.round(this.currentXp * (this.level / 2));
    opponent.gainXp(xpFactor);
    this.currentXp = 0;
    return true;
  }
}