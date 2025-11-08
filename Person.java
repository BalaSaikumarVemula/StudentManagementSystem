import java.io.Serializable;

// Abstraction: Person defines a common structure for all person types
public abstract class Person implements Serializable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: private fields + getters/setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Abstract method to be implemented by subclasses
    public abstract String getDetails();
}
