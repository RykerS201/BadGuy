import java.util.Scanner;
public class Hero {
    /////////////////////////////////////////////////////
    // Instance Variables
    /////////////////////////////////////////////////////

    private String name;

    // Hero Stats
    private int hitPoints;
    
    //private Attacks attacks;
    
    /////////////////////////////////////////////////////
    // Constructors
    /////////////////////////////////////////////////////

    // I have included 2 constructors, add other constructors for your program's use cases

    // Default Constructor
    public Hero() {
        // ** make sure that you are instantiating your instance variables **
        this.name = "Hero";

        this.hitPoints = 100;
        //this.attacks = new Attacks();

    }

    // Constructor with all parameters
    public Hero(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        //this.attacks = new Attacks();
    }

    /////////////////////////////////////////////////////
    // Class Methods
    /////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the hero's name?");
        name = input.nextLine();
        if (name.equals("cookiemonster420"))
        {
            hitPoints = 3000;
        }
        else
        {
            hitPoints = 100;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean isDead() {
        return this.hitPoints <= 0;
    }
}