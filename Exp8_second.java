/*2) Imagine a role-playing game where a player’s health is managed by a class Player. When a player's health falls below zero due to an attack, 
the program should throw a custom exception called PlayerDefeatedException. Create a method takeDamage(int damage) that deducts health and throws the exception
 when health becomes negative. In your main method, simulate an attack that causes the exception and handle it to display a defeat message. */
// Custom exception when player health drops below zero
class PlayerDefeatedException extends Exception {

    public PlayerDefeatedException(String message) {
        super(message);
    }
}

// Player class to manage health
class Player {

    private int health;

    // Constructor to initialize player health
    public Player(int health) {
        this.health = health;
    }

    // Method to apply damage to player
    public void takeDamage(int damage) throws PlayerDefeatedException {
        health -= damage;
        if (health < 0) {
            throw new PlayerDefeatedException("Game Over! The player has been defeated.");
        }
        System.out.println("Player took " + damage + " damage. Remaining health: " + health);
    }
}

public class Exp8_second {

    public static void main(String[] args) {
        // Create a player with initial health
        Player player = new Player(50);

        // Simulate attacks
        try {
            player.takeDamage(30); // Health = 20
            player.takeDamage(20); // Health = 0
            player.takeDamage(10); // This will trigger the exception
        } catch (PlayerDefeatedException e) {
            System.out.println(e.getMessage());
        }
    }
}
