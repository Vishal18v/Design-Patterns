package javaConcepts.streams;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//public class Practice {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//
//        List<Integer> evenNums = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
//        System.out.println(evenNums);
//
//        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
//        fruits = fruits.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());
//        System.out.println(fruits);
//
//        List<String> words = Arrays.asList("java", "python", "java", "c++", "python");
//        words = words.stream().distinct().toList();
//        System.out.println(words.get(0));
//
//        numbers = Arrays.asList(5,10,34,2345,34,34);
//        int sum = numbers.stream().reduce(0, Integer::sum);
//        System.out.println(sum);
//
//        List<String> inputStrings = Arrays.asList("java", "stream", "api", "programming");
//        inputStrings = inputStrings.stream().sorted().toList();
//        System.out.println(inputStrings);
//
//        numbers = Arrays.asList(8, 3, 15, 23, 9);
//        Optional<Integer> maximum = numbers.stream().max(Integer::compare);
//        System.out.println(maximum);
//
//
//        List<Person> people = Arrays.asList(
//                new Person("Alice", 25),
//                new Person("Bob", 17),
//                new Person("Charlie", 35),
//                new Person("David", 29),
//                new Person("Eve", 40)
//        );
//
//        // Grouping people by age range
//        Map<String, List<Person>> groupedByAge = people.stream()
//                .collect(Collectors.groupingBy(p -> {
//                    if (p.age < 20) return "<20";
//                    else if (p.age <= 30) return "20-30";
//                    else return "30+";
//                }));
//
//        groupedByAge.forEach((range, persons) -> {
//            System.out.println(range + ": " + persons.stream().map(p -> p.name).collect(Collectors.toList()));
//        });
//
//    }
//}
//
//class Person {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//


class PrintAlternately {
    private final Object lock = new Object();
    private int count = 0; // Determines which thread should print

    void printA() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                while (count % 2 != 0) { // Wait if it's not A's turn
                    try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println("A");
                count++; // Move to next turn
                lock.notify(); // Wake up other thread
            }
        }
    }

    void printB() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                while (count % 2 != 1) { // Wait if it's not B's turn
                    try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println("B");
                count++; // Move to next turn
                lock.notify(); // Wake up other thread
            }
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        PrintAlternately obj = new PrintAlternately();

        Thread t1 = new Thread(obj::printA);
        Thread t2 = new Thread(obj::printB);

        t1.start();
        t2.start();
    }
}
