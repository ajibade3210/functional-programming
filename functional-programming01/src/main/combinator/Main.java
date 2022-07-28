package combinator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "Alice@gamil.com",
                "+089817563220",
                LocalDate.of(2000, 1, 1)
        );
    System.out.println(new CustomerValidatorService().isValid(customer));

    //We Can Store CUstomer In DB

    }

}
