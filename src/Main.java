import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Halk");
        boss.setHealth(200);
        boss.setDamage(50);
        Weapon weapon = new Weapon();
        weapon.setName("skar");
        weapon.setType("скорострельность");
        System.out.println(boss.getName() );
        System.out.println(boss.getHealth() );
        System.out.println(boss.getDamage());
        System.out.println(weapon.getName());
        System.out.println(weapon.getType());

        // Доп снизу
        boss.printinfo();
        Skeleton skeleton = new Skeleton();
        skeleton.setSpine(33);
        skeleton.setBones(208);
        skeleton.printinfo();






    }
}

