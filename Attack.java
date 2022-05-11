import java.util.Scanner;
public class Attack {
    private int damage;
    private String name;

    public Attack() {
        this.damage = 0;
        this.name = "asdf";
    }
    public Attack(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void fight() {
        Hero good = new Hero();
        BadGuy bad = new BadGuy();
        int health1 = bad.getHitPoints();
        int health2 = good.getHitPoints();
        String winner = "";
        String loser = "";
        while(health1 > 0 && health2 > 0)
        {
            System.out.println("Pick a move Bad Guy: Goodnight Babies || Arf Arf Bark || Cat flees || Surrender Now");
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            if(move.equals("Goodnight Babies"))
            {
                damage = 10;
                System.out.println(bad.getName() + " did 10 damage!");
                health1 -= 10;
            }
            else if(move.equals("Arf Arf Bark"))
            {
                damage = 20;
                System.out.println(bad.getName() + " did 20 damage!");
                health1 -= 20;
            }
            else if(move.equals("Cat flees"))
            {
                damage = 5;
                System.out.println(bad.getName() + " did 5 damage!");
                health1 -= 5;
                System.out.println(health1);
            }
            else if(move.equals("Surrender Now"))
            {
                damage = 0;
                System.out.println(bad.getName() + " did no damage, because Team Rocket is stupid.");
            }
            else {
                System.out.println("Your attack missed completely.");
            }
            
            System.out.println("Pick a move Hero: Goodnight Babies || Arf Arf Bark || Cat flees || Surrender Now");
            String move2 = input.nextLine();
            if(move2.equals("Goodnight Babies"))
            {
                damage = 10;
                System.out.println(good.getName() + " did 10 damage!");
                health2 -= 10;
            }
            else if(move2.equals("Arf Arf Bark"))
            {
                damage = 20;
                System.out.println(good.getName() + " did 20 damage!");
                health2 -= 20;
            }
            else if(move2.equals("Cat flees"))
            {
                for(int i = 1; i <=4; i++)
                {
                damage = 5 * i;
                System.out.println(good.getName() + " did " + damage + "damage!");
                health2 -= 5 * i;
                System.out.println(health2);
                }
            }
            else if(move2.equals("Surrender Now"))
            {
                damage = 0;
                System.out.println(good.getName() + " did no damage, because Team Rocket is stupid.");
            }
            else {
                System.out.println("Your attack missed completely.");
            }
            
        }
        if (health1 == 0)
        {
            loser = bad.getName();
            winner = good.getName();
        }
        else if(health2 == 0)
        {
            loser = good.getName();
            winner = bad.getName();
        }
        System.out.println(winner + " defeated " + loser + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}