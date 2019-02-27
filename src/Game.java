import javax.swing.*;
import java.util.Random;

public class Game {

    // This where the player's choice of action is stored
    private String action;

    // You can store a message that you want to print here
    private String message;

    // This variable stores how many pokeballs the player has
    private int numPokeballs;

    // This is the text that prints when the game starts
    private String welcomeDialog = "Welcome Pokémon Trainer!";

    // This is the text that prints at the main menu
    private String menuDialog = "What would you like to do?\nA. Look for Pokémon\nB. Go to Pokécenter\nC. Check your Bag\nD. Quit";

    // This is the "object" that we can use to get random numbers!
    // It is a single instance of the "Random" class, and we have named it random
    private Random random;

    // This is where we initialize our variables
    public Game() {
        action = "";
        message = welcomeDialog;
        random = new Random();
        numPokeballs = 100;
    }

    public void run() {

        JOptionPane.showMessageDialog(null, message);

        while (action != "D") {

            message = menuDialog;

            // Get the player's response from the dialog box
            action = JOptionPane.showInputDialog(message);

            // Convert the text response to upper case
            action = action.toUpperCase();
            JOptionPane.showMessageDialog(null, action);

            // Now we do something depending on which choice the player makes!
            // Look for Pokemon!
            if (action.compareTo("A") == 0) {      // action.compareTo("") returns 0 if the strings are equal
                // The player found a pokemon!
                message = "A wild Pokémon has appeared!";
                JOptionPane.showMessageDialog(null, message);

                // randomly decide which pokemon the player found
                int whichPokemon = random.nextInt(2);

                // Tell the player which Pokemon they found
                if (whichPokemon == 0) {
                    message = "It's a Charmander!";
                }
                else if (whichPokemon == 1) {
                    message = "It's a Squirtle!";
                }
                else if (whichPokemon == 2) {
                    message = "It's a Bulbasaur!";
                }
                JOptionPane.showMessageDialog(null, message);

                message = "Try to catch the Pokémon? (y/n)";
                action = JOptionPane.showInputDialog(message);

                if (action.compareTo("y") == 0) {
                    // Try to catch the pokemon
                }
                else {
                    message = "The Pokémon has fled!";
                    JOptionPane.showMessageDialog(null, message);
                }

            }
            // Player chose Pokécenter
            else if (action.compareTo("B") == 0) {
                message = "Sorry, the Pokécenter is closed!";
            }
            // Player wants to check their bag
            else if (action.compareTo("C") == 0) {
                message = "You have " + numPokeballs + " Pokéballs!";
                JOptionPane.showMessageDialog(null, message);
            }

            else if (action.compareTo("D") != 0) {
                message = "That's not a valid choice, try again!";
                JOptionPane.showMessageDialog(null, message);
            }
        }

        JOptionPane.showMessageDialog(null, "Goodbye!");

    }

}
