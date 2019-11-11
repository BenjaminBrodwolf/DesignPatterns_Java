package prototype.javacloneable.shallowcopy;

public class Dog implements Cloneable {
    private String name;
    private int age;
    private Person owner;

    public Dog(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public Dog clone(){
        try{
            return (Dog) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
