package advanced_oop.interfaces.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Rodrigo", 20), new User("João", 32), new User("Ana", 23), new User("Eduardo", 30));

        // Lambda Reference
        System.out.println("-- Users names --");
        printStringValue(User::name, users);
        System.out.println();

        System.out.println("-- Users ages --");
        printAgeValue(User::age, users);
        System.out.println();


        System.out.println("-- Record to string --");
        printRecordToStringValues(Record::toString, users);
        System.out.println();

        // Lambda Expression
        // Functional interface = Lambda base (one method to implement = simplify)
        System.out.println("-- Lambda Expression --");
        users.forEach((User user) -> {
            System.out.println(user);
        });
    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

    private static void printAgeValue(Function<User, Integer> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

    private static void printRecordToStringValues(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
