public class User {
    private int userId;
    private String name;
    private String userType; // student or staff

    public User(int userId, String name, String userType) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public String getUserType() { return userType; }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name + ", Type: " + userType;
    }
}
