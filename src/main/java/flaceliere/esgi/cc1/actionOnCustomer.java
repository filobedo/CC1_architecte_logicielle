package flaceliere.esgi.cc1;

public final class actionOnCustomer {


    static UpdatedCustomer updateStateOfCustomer(User admin, User customer) {
    if(isAdmin(admin)) {
        customer.setStatutCustomer(StatutCustomer.USER_CUSTOMER);
        return UpdatedCustomer.USER_UPDATED;
    }

    return UpdatedCustomer.USER_NOT_UPDATED;
}

    static Boolean isAdmin(User user) {
        return user.getTypeUser() == typeUser.USER_ADMIN;
    }
}
