package del3;

public class Passenger {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passenger(String name) {
        this.name = name;
    }

    public Passenger() {
    }

    @Override
    public String toString() {
        return "Namn : " + name + "\n";

    }
}
