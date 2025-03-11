/*Write a Java program to create an interface Playable with methods play(), pause(), and stop(). Implement this interface in a class MusicPlayer that overrides these 
methods to print appropriate messages (e.g., "Music is playing," "Music is paused," "Music is stopped"). Create another class TestPlayer with a main() method to test 
the functionality by calling the play(), pause(), and stop() methods.
 */
// Define the Playable interface
interface Playable {

    void play();

    void pause();

    void stop();
}

// Implementing the Playable interface in the MusicPlayer class
class MusicPlayer implements Playable {

    // Implement play method
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    // Implement pause method
    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    // Implement stop method
    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
}

// Main class to test the functionality
public class Exp7_fourth {

    public static void main(String[] args) {
        // Creating an object of MusicPlayer
        MusicPlayer myPlayer = new MusicPlayer();

        // Calling play, pause, and stop methods
        myPlayer.play();
        myPlayer.pause();
        myPlayer.stop();
    }
}
