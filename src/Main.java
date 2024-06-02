import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name:");
        String userName = scanner.nextLine();

        System.out.println("Enter user age:");
        int userAge = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        System.out.println("Enter user gender:");
        String userGender = scanner.nextLine();

        Person person = new Person(userName, userAge, userGender);

        System.out.println("Enter friend's name (or type 'done' to finish adding friends):");
        String friendName;
        List<String> friends = new ArrayList<>();
        while (!(friendName = scanner.nextLine()).equals("done")) {
            friends.add(friendName);
            System.out.println("Enter next friend's name (or type 'done' to finish adding friends):");
        }
        for (String friend : friends) {
            person.addFriend(friend);
        }

        System.out.println("Enter enemy's name (or type 'done' to finish adding enemies):");
        String enemyName;
        List<String> enemies = new ArrayList<>();
        while (!(enemyName = scanner.nextLine()).equals("done")) {
            enemies.add(enemyName);
            System.out.println("Enter next enemy's name (or type 'done' to finish adding enemies):");
        }
        for (String enemy : enemies) {
            person.addEnemy(enemy);
        }

        System.out.println("Enter task (or type 'done' to finish adding tasks):");
        String task;
        List<String> tasks = new ArrayList<>();
        while (!(task = scanner.nextLine()).equals("done")) {
            tasks.add(task);
            System.out.println("Enter next task (or type 'done' to finish adding tasks):");
        }
        for (String t : tasks) {
            person.addTask(t);
        }

        person.displayInfo();

        UserListProcessor processor = new UserListProcessor(new ArrayList<>());

        System.out.println("Enter new user name:");
        String newUserName = scanner.nextLine();

        System.out.println("Enter new user email:");
        String newUserEmail = scanner.nextLine();

        System.out.println("Enter new user password:");
        String newUserPassword = scanner.nextLine();

        System.out.println("Enter new user address:");
        String newUserAddress = scanner.nextLine();

        processor.addUser(newUserName, newUserEmail, newUserPassword, newUserAddress);
        processor.sendEmailToUser(newUserName, newUserEmail);

        scanner.close();
    }
}