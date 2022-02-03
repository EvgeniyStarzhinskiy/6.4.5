public class Main {


    public static void main(String[] args) {
/*

Inherite class Zombie from the class Monster
(add your code there)

*/

        Zombie zombie = new Zombie("Alice");
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);


/*
This fragment of code has to output

Monster Alice the Zombie was created
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie was created
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled

NOTE: The code of Zombie class has to output
      SMALL part of this.

The most output class Monster makes.
You cannot see Monster class source,
but can instance objects of it and play with them.


*/
    }

}