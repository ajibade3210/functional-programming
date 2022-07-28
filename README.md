#### Streams bring functional Programming to Java, and are supported starting from Java 8

#### Advantages
- Will make you a more efficient java programm
- Make heavy use of lambda expressions
- ParallelStreams make it very easy to multi-thread operations

#### Stream Source

Strem can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file.

Source — Filter — Sort — Map — Collect —>

Stream Operations are either intermediate or terminal
- Intermediate Operations such as filter, map or sort **return a stream**, we can chain multiple intermediate operations
- Terminal Operations such forEach, collect or reduce are either void or return a non- stream result..


### Intermediate Operations
Zero or more intermediate operations are allowed. Order matters for large datasets: filter first, then sort or map. For very large datasets use ParallelStream to enable multiple threads. Intermediate operations include:

anyMatch()           flatmap()
distinct()              map()
filter()                   skip()
findFirst()              sorted()

### Terminal Operations
One terminal operation is allowed only

forEach applies the same function to each element.
collect saves the element into a collection, array, list 

other options reduce the stream to a single summary element

count                   min()

max()                   reduce()
                            summaryStatistics()
a, b, c ⇒> Z

### Functional interfaces
Functional interfaces provide target types for lambda expressions and method references. Each functional interface has a single abstract method, called the functional method for that functional interface, to which the lambda expression's parameter and return types are matched or adapted. Functional interfaces can provide a target type in multiple contexts, such as assignment context, method invocation, or cast context:
- Assignment context  
Predicate<String> p = String::isEmpty;   

 - Method invocation context 
 stream.filter(e -> e.getSize() > 10)...    

- Cast context  
stream.map((ToIntFunction) e -> e.getSize())...


```java
public static void printSquareNumberInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2== 1 )
                .map(n -> n*n)
                .forEach(System.out::println);
    }
```

 // .filter(FP01Functional::isEven)  //Method Reference
//                MR  refers to code defined some where else


```
ctrl + alt + v
//extract lambda and method reference to a variable//
Function<Person, Gender> personGenderFunction = p -> p.gender;
        final Collector<Gender, ?, Set<Gender>> genderSetCollector = Collectors.toSet();
        final Consumer<Gender> println = System.out::println;
        people.stream()
                .map(personGenderFunction)
                .collect(genderSetCollector)
                .forEach(println);
```