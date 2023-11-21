package poo.inheritance.game.classes;

import poo.inheritance.game.Player;

public class Mage extends Player {
  public double lifePoints = 80;
  public double strength = .8;
  public double mana = 85;
  public double magicFactor = 1.3;
  public double defendFactor = .7;
  public int superBar = 0;

  public Mage(String name) {
    super(name);
    super.lifePoints = lifePoints;
    super.strength = strength;
    super.mana = mana;
    super.magicFactor = magicFactor;
    super.defendFactor = defendFactor;
  }

  public boolean attack(Player opponent) {
    int possibility = (int) Math.round(Math.random() * 100) + (this.level - opponent.level) * 10;
    if (possibility >= 100)
      return this.criticalAttack(opponent);
    return super.attack(opponent);
  }

  public boolean criticalAttack(Player opponent) {
    this.strength *= 2;
    super.attack(opponent);
    this.strength /= 2;
    return true;
  }
}
