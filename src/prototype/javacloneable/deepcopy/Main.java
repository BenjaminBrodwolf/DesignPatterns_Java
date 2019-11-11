package prototype.javacloneable.deepcopy;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Lukas");
        Dog dog = new Dog("Bella", 4, person1);

        Dog clonedDog = dog.clone();
        System.out.println("------- Deep Copy with Java Cloneable Beispiel -------");
        printDog(dog, true);
        printDog(clonedDog, false);

        // Deep Copy: Eine Änderung von einem mutable field beim Clone, hat keine Auswirkung auf das original
        System.out.println("--- change name of owner from clone ---");
        clonedDog.getOwner().setName("Stefan");
        printDog(dog, true);
        printDog(clonedDog, false);

    }

    public static void printDog(Dog dog, boolean original) {
        String copyOrClone = original ? "original" : "cloned";

        System.out.println("name of " + copyOrClone + " dog: " + dog.getName());
        System.out.println("age of " + copyOrClone + " dog: " + dog.getAge());
        System.out.println("owner of " + copyOrClone + " dog: " + dog.getOwner().getName());
        System.out.println("-------------------------------");
    }
}
