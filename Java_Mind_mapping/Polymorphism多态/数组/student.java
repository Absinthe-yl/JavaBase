package Java_Mind_mapping.Polymorphism多态.数组;

public class student extends Person{
    private double score;
    //有参构造
    public student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类say()方法
    @Override
    public String say() {
        return super.say()+"score="+score;
    }
    //属于子类自己的方法
    public void study(){
        System.out.println("学生"+getName()+"正在开小差");
    }
}
