package stream;

import imperative.Main;

import java.util.List;
import java.util.stream.Collectors;

import static stream._Streams.Gender.FEMALE;
import static stream._Streams.Gender.MALE;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John",MALE),
                new Person("Jane", FEMALE),
                new Person("Alex", MALE),
                new Person("Maria", FEMALE),
                new Person("Jude", MALE)
        );


        people.stream()
                .map(p-> p.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,FEMALE
    }
}
