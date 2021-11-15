package flaceliere.esgi.cc1;

public class User {
    private final int id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private typeUser typeUser;
    private StatutCustomer statutCustomer;
    private Address address;

    public User(int id, String firstName, String lastName, String mail, String password, typeUser typeUser, StatutCustomer statutCustomer, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.typeUser = typeUser;
        this.address = address;
        this.statutCustomer = statutCustomer;
    }

    public User(int id, String firstName, String lastName, String mail, String password, typeUser typeUser, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.typeUser = typeUser;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public StatutCustomer getStatutCustomer() {
        return statutCustomer;
    }

    public void setStatutCustomer(StatutCustomer statutCustomer) {
        this.statutCustomer = statutCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMail() {
        return mail;
    }

    public typeUser getTypeUser() {
        return typeUser;
    }

    public Address getAddress() {
        return address;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTypeUser(flaceliere.esgi.cc1.typeUser typeUser) {
        this.typeUser = typeUser;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
