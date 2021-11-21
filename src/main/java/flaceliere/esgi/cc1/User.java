package flaceliere.esgi.cc1;

import java.util.InvalidPropertiesFormatException;

public class User {
    private final int id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private TypeUser typeUser;
    private Address address;
    private StatePaiementUser statePaiementUser;



    public User(int id, String firstName, String lastName, String mail, String password, TypeUser typeUser, Address address) throws InvalidPropertiesFormatException {
        if (!isValideEmailAddress(mail)) {
            throw new InvalidPropertiesFormatException("Invalid email address");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.typeUser = typeUser;
        this.address = address;
        this.statePaiementUser = StatePaiementUser.CAN_NOT_PAY;
    }

    public boolean isValideEmailAddress(String address) {
        return address.indexOf('@') != -1;
    }

    public void updatePaiementAuthUser() {
        this.statePaiementUser = StatePaiementUser.CAN_PAY;
    }

    public void setStatePaiementUser(StatePaiementUser statePaiementUser) {
        this.statePaiementUser = statePaiementUser;
    }

    public String getLastName() {
        return lastName;
    }

    public StatePaiementUser getStatePaiementUser() {
        return statePaiementUser;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMail() {
        return mail;
    }

    public TypeUser getTypeUser() {
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

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
