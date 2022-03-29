package model;

import java.util.Objects;

public class Friend extends Contact{

    private String telephoneNumber;

    public Friend() {
        super();
    }

    public Friend(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Friend friend = (Friend) o;

        return Objects.equals(name, friend.name) && Objects.equals(telephoneNumber, friend.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telephoneNumber);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
