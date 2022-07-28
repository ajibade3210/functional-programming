package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    //Represents a predicate (boolean valued function) of
    //one argument
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+23407064639838"));
        System.out.println(isPhoneNumberValid("07064639838"));
        System.out.println("PREDICATE");

        System.out.println(isPhoneNumberValidPredicate.test("+2347064639838"));
        System.out.println(isPhoneNumberValidPredicateV2.test("07064639838"));
        System.out.println("Combine Predicate");
        System.out.println(isPhoneNumberValidPredicateV2
                .and(containsNumber3)
                        .test("07064639838"));
    }

    //PREDICATE
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+234") && phoneNumber.length() >= 11;

    //Combine Predicate
    static Predicate<String> isPhoneNumberValidPredicateV2 = phoneNumber ->
            phoneNumber.endsWith("38") && phoneNumber.length() >= 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");


    //REGULAR
    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("+234") && phoneNumber.length() >= 11;
    }
}
