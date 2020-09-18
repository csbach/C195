package C195.models;

public class Customer {

    private int customerId;
    private String customerName;
    private int addressId;
    private boolean active;

    public Customer(int customerId, String customerName, int addressId, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.addressId = addressId;
        this.active = active;
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

}
