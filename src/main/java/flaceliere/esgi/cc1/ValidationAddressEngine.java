package flaceliere.esgi.cc1;

import java.util.function.Predicate;
import flaceliere.esgi.cc1.kernel.Engine;

@Engine
public class ValidationAddressEngine implements Predicate<Address> {

    private static final ValidationAddressEngine INSTANCE = new ValidationAddressEngine();

    private ValidationAddressEngine() {
    }

    public static ValidationAddressEngine getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean test(Address address) {
        return true;
    }

    public boolean isValidateAddress(Address address) {
        return true;
    }
}
