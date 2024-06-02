import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String gender;
    private List<String> friends;
    private List<String> enemies;
    private List<String> tasks;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }

    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Friends: " + this.friends);
        System.out.println("Enemies: " + this.enemies);
        System.out.println("Tasks: " + this.tasks);
    }
}
