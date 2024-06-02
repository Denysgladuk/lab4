import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<String> usernames;

    public UserListProcessor(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

    public void processUserList() {
        for (String username : usernames) {
            processUser(username);
        }
    }

    private void processUser(String username) {
        System.out.println("Processing user: " + username);
        if (isAdmin(username)) {
            System.out.println("Admin user detected!");
        }
    }

    private boolean isAdmin(String username) {
        return username.contains("admin");
    }

    public int countAdminUsers() {
        int adminCount = 0;
        for (String username : usernames) {
            if (isAdmin(username)) {
                adminCount++;
            }
        }
        return adminCount;
    }

    public void addUser(String username, String email, String password, String address) {
        System.out.println("Adding user: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Address: " + address);
    }

    public void sendEmailToUser(String username, String email) {
        System.out.println("Sending email to user: " + username);
        System.out.println("Email: " + email);
    }
}