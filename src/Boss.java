public class Boss extends GameEntity{
  private Weapon weapon;


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printinfo(){
        return "boss Damage - " + getDamage() +"bosHealth -" + getHealth() + "boss Ability";

    }



}




