package kg.geeks.game.players;


import kg.geeks.game.logic.RPG_Game;

public class Magic extends Hero {
    private static int boostPoints = RPG_Game.random.nextInt(8) + 2;

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && !(heroes[i] instanceof Witcher) && heroes[i].getHealth() != 0) {
                heroes[i].setDamage(getDamage() + boostPoints);
                System.out.println(getClass().getSimpleName() + " " + getName() + " увеличил урон игрока "
                        + heroes[i].getName() + " на " + boostPoints);
            }
        }
    }
}
