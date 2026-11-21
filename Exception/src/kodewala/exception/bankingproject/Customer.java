
package kodewala.exception.bankingproject;

import java.io.Serializable;

public class Customer implements Serializable ,Cloneable {

    private static final long serialVersionUID = 1L;

    private String customerId;
    private String name;
    private Address address;

    // Constructor
    public Customer(String customerId, String name, Address address) {

        setCustomerId(customerId);
        setName(name);
        setAddress(address);
    }

    // Getters and Setters

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {

        if (customerId != null && !customerId.isBlank()) {
            this.customerId = customerId;
        } else {
            throw new IllegalArgumentException(
                "Customer ID cannot be null or blank"
            );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException(
                "Customer name cannot be null or blank"
            );
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {

        if (address != null) {
            this.address = address;
        } else {
            throw new IllegalArgumentException(
                "Address cannot be null"
            );
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
     Customer clonedCustomer = (Customer) super.clone();
     
     if ( this.address != null) {
     clonedCustomer.address = (Address) this.address.clone();
     }
     return clonedCustomer;
    }
    
    
    
    
}
