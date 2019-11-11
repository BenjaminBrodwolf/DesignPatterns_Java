package prototype.copyconstructor.deepcopy;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private Person(Person original){
        this.name = original.name;
    }

    public Person clone() {
        return new Person(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
