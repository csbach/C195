package C195.models;

import java.util.Calendar;

public class User {

    private int userId;
    private String userName;
    private String password;
    private boolean active;
    private Calendar createDate;
    private String createdBy;
    private Calendar lastUpdate;
    private String lastUpdateBy;

    public User(int userId, String userName, String password, boolean active, Calendar createDate, String createdBy, Calendar lastUpdate, String lastUpdateBy) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
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

    /**
     * @return the date/time of creation
     */
    public Calendar getCreateDate() { return this.createDate; }

    /**
     * @param createDate the creation date/time to be set
     */
    public void setCreateDate(Calendar createDate) { this.createDate = createDate; }

    /**
     * @return the user/person creating the user
     */
    public String getCreatedBy() { return this.createdBy; }

    /**
     * @param createdBy the creating user/person to be set
     */
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    /**
     * @return the last date/time the user was updated
     */
    public Calendar getLastUpdate() { return this.lastUpdate; }

    /**
     * @param lastUpdate the date/time of the last update to be set
     */
    public void setLastUpdate(Calendar lastUpdate) { this.lastUpdate = lastUpdate; }

    /**
     * @return the user/person who last updated the user
     */
    public String getLastUpdateBy() { return this.lastUpdateBy; }

    /**
     * @param lastUpdateBy the user/person who last updated the user to be set
     */
    public void setLastUpdateBy(String lastUpdateBy) { this.lastUpdateBy = lastUpdateBy; }

}
