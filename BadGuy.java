import java.util.Scanner;
public class BadGuy {
    /////////////////////////////////////////////////////
    // Instance Variables
    /////////////////////////////////////////////////////
    Scanner input = new Scanner(System.in); 
    private String name;

    // Hero Stats
    private int hitPoints;

    /////////////////////////////////////////////////////
    // Constructors
    /////////////////////////////////////////////////////

    // I have included 2 constructors, add other constructors for your program's use cases

    // Default Constructor
    public BadGuy() {
        // ** make sure that you are instantiating your instance variables **
        this.name = "Bad Guy";

        this.hitPoints = 100;

    }

    // Constructor with all parameters
    public BadGuy(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
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
        System.out.println("What's the bad guys name?");
        name = input.nextLine();
        if (name.equals("cookiemonster420"))
        {
            this.hitPoints = 3000;
        }
        else
        {
            this.hitPoints = 100;
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