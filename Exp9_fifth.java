/*5) Write a class Person with fields like name and age, implementing Serializable. 
In your main method, create an instance of Person and serialize it to a file 
(person.txt) using ObjectOutputStream. Then, read it back using ObjectInputStream 
and confirm that the deserialized object has the same field values. */
import java.io.*;

class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Deserialized Person -> Name: " + name + ", Age: " + age);
    }
}

public class Exp9_fifth {

    public static void main(String[] args) {
        Person person1 = new Person("Aman", 25);
        String filename = "person.txt";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(person1);
            System.out.println("Person object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialization: Reading object from a file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Person object deserialized successfully.");
            deserializedPerson.displayPerson(); // Displaying deserialized object data
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
