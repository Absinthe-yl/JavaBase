package Java_Mind_mapping.Polymorphism多态.数组;

public class teacher extends Person{
    private int salary;
    //有参构造
    public teacher(String name, int age, int salary){
        super(name,age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //重写父类的say()方法
    @Override
    public String say() {
        return super.say()+"salary="+salary;
    }
    //属于子类自己的方法
    public void tech(){
        System.out.println("老师"+getName()+"正在教java");
    }
}
