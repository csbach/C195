package C195.models;

import java.util.Calendar;

public class Customer {

    private int customerId;
    private String customerName;
    private int addressId;
    private boolean active;
    private Calendar createDate;
    private String createdBy;
    private Calendar lastUpdate;
    private String lastUpdateBy;

    public Customer(int customerId, String customerName, int addressId, boolean active, Calendar createDate, String createdBy, Calendar lastUpdate, String lastUpdateBy) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.addressId = addressId;
        this.active = active;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * @return the customer's ID
     */
    public int getCustomerId() { return this.customerId; }

    /**
     * @param customerId the customer ID to be set
     */
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    /**
     *
     * @return the customer's name
     */
    public String getCustomerName() { return this.customerName; }

    /**
     *
     * @param customerName the customer's name to be set
     */
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    /**
     *
     * @return the customer's address ID
     */
    public int getAddressId() { return this.addressId; }

    /**
     *
     * @param addressId the customer's address ID to be set
     */
    public void setAddressId(int addressId) { this.addressId = addressId; }

    /**
     *
     * @return the customer's active status
     */
    public boolean getActive() { return this.active; }

    /**
     *
     * @param active the customer's status to be set
     */
    public void setActive(boolean active) { this.active = active; }

    /**
     *
     * @return the customer's creation date
     */
    public Calendar getCreateDate() { return this.createDate; }

    /**
     *
     * @param createDate the customer's creation date to be set
     */
    public void setCreateDate(Calendar createDate) { this.createDate = createDate; }

    /**
     *
     * @return the user who created this customer
     */
    public String getCreatedBy() { return this.createdBy; }

    /**
     *
     * @param createdBy the creating user to be set
     */
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    /**
     *
     * @return the date of the last update for this customer
     */
    public Calendar getLastUpdate() { return this.lastUpdate; }

    /**
     *
     * @param lastUpdate the last update's date to be set
     */
    public void setLastUpdate(Calendar lastUpdate) { this.lastUpdate = lastUpdate; }

    /**
     *
     * @return the user who last updated this customer
     */
    public String getLastUpdateBy() { return this.lastUpdateBy; }

    /**
     *
     * @param lastUpdateBy the user who last updated to be set
     */
    public void setLastUpdateBy(String lastUpdateBy) { this.lastUpdateBy = lastUpdateBy; }
}
