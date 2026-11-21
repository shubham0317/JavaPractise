
package kodewala.exception.bankingproject;

import java.io.Serializable;

public class Address implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String city;
    private String state;
    private String pinCode;

    public Address(String city, String state, String pinCode) {

        setCity(city);
        setState(state);
        setPinCode(pinCode);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {

        if (city != null && !city.isBlank()) {
            this.city = city;
        } else {
            throw new IllegalArgumentException(
                "City cannot be null or blank"
            );
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {

        if (state != null && !state.isBlank()) {
            this.state = state;
        } else {
            throw new IllegalArgumentException(
                "State cannot be null or blank"
            );
        }
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {

        if (pinCode != null &&
            pinCode.matches("[1-9][0-9]{5}")) {

            this.pinCode = pinCode;

        } else {
            throw new IllegalArgumentException(
                "Invalid Indian PIN code"
            );
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
