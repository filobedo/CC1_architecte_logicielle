package flaceliere.esgi.cc1;

import java.util.InvalidPropertiesFormatException;

public class main {
    public static void main(String[] args) throws InvalidPropertiesFormatException {

        User tradesMan = new User(1, "Fred", "Fla", "fred@gmail.com", "toto", TypeUser.USER_NEW_TRADESMAN, new Address(1, "Paris", 10, "Tourcoin street"));
        User contractor = new User(2, "Fred", "Fla", "fred@gmail.com", "toto", TypeUser.USER_NEW_CONTRACTOR, new Address(1, "Paris", 10, "Tourcoin street"));

        User userAdmin = new User(3, "Fred", "Fla", "fred@gmail.com", "toto", TypeUser.USER_ADMIN, new Address(1, "Paris", 10, "Tourcoin street"));


        System.out.println(tradesMan.getTypeUser());
        System.out.println(tradesMan.getStatePaiementUser());
        System.out.println("-----------");

        actionOnMember.updateStateOfCustomer(userAdmin, tradesMan, TypeUser.USER_TRADESMAN);
        actionOnMember.updatePaiementOfCustomer(tradesMan);

        System.out.println(tradesMan.getTypeUser());
        System.out.println(tradesMan.getStatePaiementUser());


    }
}
