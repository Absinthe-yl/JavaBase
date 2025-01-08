package Java_Mind_mapping.Polymorphism多态.数组;

public class T01 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("a",20);
        persons[1] = new student("b",30,100);
        persons[2] = new student("c",40,20);
        persons[3] = new teacher("d",30,1000);
        persons[4] = new teacher("e",40,2000);

        //循环遍历多态数组，调用say()方法
        for(int i=0;i<persons.length;i++){
            //编译类型都是Person,但运行类型是student和teacher
            System.out.println(persons[i].say());//动态绑定机制

            //调用属于子类自己的方法
            if(persons[i] instanceof student){
                ((student)persons[i]).study();
            }else if(persons[i] instanceof teacher){
                teacher teachers=(teacher)persons[i];//向下转型
                teachers.tech();
            }else if(persons[i] instanceof Person){

            }else{
                System.out.println("类型有误");
            }
        }
    }
}
