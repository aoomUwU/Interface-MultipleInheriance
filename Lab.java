public class Lab {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.Attack();
        p1.Defend();
        p1.Spell("WaterGun");
        p1.UseWeapon();
    }
}

interface Character {
    void Attack();
    void Defend();
}

interface Mage {
    void Spell(String spell);
}

interface Warrior {
    void UseWeapon();
}

class Player implements Character, Mage, Warrior {
    public void Attack() {
        System.out.println("The player attack the enemy.");
    }

    public void Defend() {
        System.out.println("The player defend against the enemy's attack.");
    }

    public void Spell(String spell) {
        System.out.println("The player cast "+spell);
    }

    public void UseWeapon() {
        System.out.println("The player Use a weapon to attack.");
    }
}
