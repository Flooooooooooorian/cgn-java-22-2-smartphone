package model;

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
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
