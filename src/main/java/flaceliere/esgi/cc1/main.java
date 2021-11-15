package flaceliere.esgi.cc1;

public class main {
    public static void main(String[] args) {

        User userClient = new User(1, "Fred", "Fla", "fred@gmail.com", "toto", typeUser.USER_CUSTOMER, StatutCustomer.USER_NEW_CUSTOMER, new Address(1, "Paris", 10, "Tourcoin street"));
        User userAdmin = new User(1, "Fred", "Fla", "fred@gmail.com", "toto", typeUser.USER_ADMIN, new Address(1, "Paris", 10, "Tourcoin street"));


        actionOnCustomer.updateStateOfCustomer(userAdmin, userClient);

        System.out.println(userClient.getStatutCustomer());
    }
}
