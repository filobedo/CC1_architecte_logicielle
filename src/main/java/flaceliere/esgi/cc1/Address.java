package flaceliere.esgi.cc1;
//test
public class Address {

    private final int id;
    private final String city;
    private final int number;
    private final String street;


    public Address(int id, String city, int number, String street) {
        this.id = id;
        this.city = city;
        this.number = number;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }
}
