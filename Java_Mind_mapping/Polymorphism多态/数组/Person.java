package Java_Mind_mapping.Polymorphism多态.数组;

public class Person {
    private String name;
    private int age;
    //public Person(){};
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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


    public String say(){
        return name+age;
    }
}