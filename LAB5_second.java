/*
 * Create a Java program with a Player class and derive three subclasses: Cricket_Player, 
Football_Player, and Hockey_Player. Implement attributes such as name, age, and 
position, and methods like play() and train() to represent these players.

 */
class Player {  //parent

    protected String name;
    protected int age;
    protected String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void play() {
        System.out.println(name + " is playing in the position: " + position);
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player { //child1

    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing cricket as " + position);
    }
}

class Football_Player extends Player {//child2

    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing football as " + position);
    }
}

class Hockey_Player extends Player { //child3

    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing hockey as " + position);
    }
}

public class LAB5_second {

    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballer = new Football_Player("Cristiano Ronaldo", 39, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder");

        cricketer.play();
        cricketer.train();

        footballer.play();
        footballer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
