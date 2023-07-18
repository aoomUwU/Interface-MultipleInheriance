public class Lab {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.Attack();
        p1.Defend();
        p1.Spell("WaterGun");
        p1.Eweapon();
    }
}
interface Character{
    void Attack();
    void Defend();
}
interface Mage{
    void Spell(String spell);
}
interface Warrior{
    void Eweapon();
}

class Player implements Character, Mage, Warrior{
    public void Attack(){
        System.out.println("Player attack");
    }
    public void Defend(){
        System.out.println("Player defend");
    }

    public void Spell(String spell){
        System.out.println("Player use "+spell);
    }

    public void Eweapon(){
        System.out.println("Player equip weapon");
    }
}
