package C195.models;

public class User {

    private int userId;
    private String userName;
    private String password;
    private boolean active;

    public User(int userId, String userName, String password, boolean active) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.active = active;
    }

    /**
     * @return the user's ID
     */
    public int getUserId() { return this.userId; }

    /**
     * @param userId the ID to set for the user
     */
    public void setUserId(int userId) { this.userId = userId; }

    /**
     * @return the user's username
     */
    public String getUserName() { return this.userName; }


    /**
     * @param userName the username to set for the user
     */
    public void setUserName(String userName) { this.userName = userName; }

    /**
     * @return the user's password
     */
    public String getPassword() { return this.password; }

    /**
     * @param password the password to set for the user
     */
    public void setPassword(String password) { this.password = password; }

    /**
     * @return the user's state as active or not
     */
    public boolean getActive() { return this.active; }

    /**
     * @param active the state to be set
     */
    public void setActive(boolean active) { this.active = active; }

}
