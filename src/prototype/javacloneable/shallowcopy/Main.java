package prototype.javacloneable.shallowcopy;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Peter");
        Dog dog = new Dog("Java", 8, person1);

        Dog clonedDog = dog.clone();
        printDog(dog, true);
        printDog(clonedDog, false);

        // Shallow Copy: Eine Änderung von einem mutable field beim Clone, ändert auch das Original
        System.out.println("--- change name of owner from clone ---");
        clonedDog.getOwner().setName("ruedi");
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
