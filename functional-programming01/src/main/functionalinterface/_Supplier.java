package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    //Supplier<T> ---> Represents a supplier of results
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println("Supplier");
        System.out.println(getDBConnectionUrlSUpplier.get());
    }

    //USING SUPPLIER
    static Supplier<String> getDBConnectionUrlSUpplier = ()->
            "jdbc://localhost:5432/users";

    //REGULAR WAY
    static  String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
}
