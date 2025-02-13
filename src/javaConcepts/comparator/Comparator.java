package javaConcepts.comparator;

import java.util.*;

class ComparatorExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Charlie", 35)
        );
        users.sort(new AgeComparator());
        System.out.println("Sorted by Age: " + users);

        users.sort(new NameComparator());
        System.out.println("Sorted by Name: " + users);
    }

}

class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u1.getAge(), u2.getAge());
    }
}

class NameComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return CharSequence.compare(u1.getName(), u2.getName());
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
