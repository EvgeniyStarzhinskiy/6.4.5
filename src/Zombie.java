public class Zombie extends Monster{
    public static String scream = "Raaaauuughhhh";
    public static String screamLoud = "RAAAAUUUGHHHH";
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    public void growl(){
        System.out.print(scream);
        super.growl();
    }
    public void growl(boolean isLoudly){
        if (isLoudly)
            System.out.print(screamLoud);
        else
            System.out.print(scream);
        super.growl();
    }
    public void attack(){
        super.attack();
        growl();
    }
}