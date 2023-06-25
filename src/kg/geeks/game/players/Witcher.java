package kg.geeks.game.players;


public class Witcher extends Hero {


    public Witcher(int health, final int damage, String name) {
        super(health, damage, SuperAbility.RESURRECTION, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0 && this != heroes[i]) {
                heroes[i].setHealth(120);
                this.setHealth(0);
                System.out.println(getClass().getSimpleName() + " " + getName() + " Оживил игрока: "
                        + heroes[i].getName());
                break;
            }
        }
    }
}
