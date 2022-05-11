public class MyProgram
{
    public static void main(String[] args)
    {
        BadGuy bad = new BadGuy();
        bad.setName();
        System.out.println(bad.getName() + "'s health = " + bad.getHitPoints());
        Hero good = new Hero();
        good.setName();
        System.out.println(good.getName() + "'s health = " + good.getHitPoints());
        System.out.println(good.getName() + " and " + bad.getName() + " are now fighting.");
        Attack atk = new Attack();
        atk.fight();
    }
}