package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    //Consumer<T>:--Represents an operation that accepts a
    // single input arguments
    //and returns no results
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "07064693238");
        greetCustomer(maria);
        greetCustomerV2(maria, false);

        //CONSUMER FUNCTION INTERFACE
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }

    //DECLARATIVE CONSUMER FUNCTIONAL INTERFACE
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber ) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
            + (showPhoneNumber? customer.customerPhoneNumber: "**********"));

    //DECLARATIVE CONSUMER FUNCTIONAL INTERFACE
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
            + customer.customerPhoneNumber);


    //IMPERATIVE
    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello" + customer.customerName +
                ", thanks for registering phone number "
            + ( showPhoneNumber ? customer.customerPhoneNumber : "************"));
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello" + customer.customerName +
                ", thanks for registering phone number "
            + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
