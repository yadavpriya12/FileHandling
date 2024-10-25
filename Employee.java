
import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
   transient private String name;
    private String contact;
    private int age;
    
    public Employee(int id, String name, String contact, int age) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.age = age;
    }

    public Employee()
    {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public int getAge() {
        return age;
    }

    
}