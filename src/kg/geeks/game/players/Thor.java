package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero{
 private static final double STUN_CHANCE = 0.2;
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(isStunSuccessful()){
            boss.setStunned(true);
            System.out.println("БОСС был обездвижен игроком " + getName());
        }
        else {
            boss.setStunned(false);
            System.out.println("Обездвижить босса не удалось");
        }
    }
    private boolean  isStunSuccessful(){
        double randomValue = 0 + RPG_Game.random.nextDouble() * (1 - 0);
        return STUN_CHANCE >= randomValue;
    }
}
