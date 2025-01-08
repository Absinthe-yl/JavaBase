package Java_Mind_mapping.encapsulation封装.封装与构造器;

public class T01 {
        public static void main(String[] args) {
            //赋值
            T01a dog1 = new T01a();
            dog1.setName("小黑");
            // getName中的值已经被setNmae改变了静态值
            //取值
            System.out.println(dog1.getName());  //String name=dog1.getName();System.out.println(name);
            dog1.setAge(-100);
            System.out.println(dog1.getAge());
            System.out.println(dog1.info());

            //如果直接构造器指定属性   此时构造器打印的内容就跳过了封装，造成信息流失
            System.out.println("=====以下是构造器内容=====");
            T01a dog2 = new T01a("小构造",-64);
            System.out.println(dog2.info());
        }

    }
class T01a {

    private String name="小白";
    public String getname(){
        return name;
    }
    private int age;//alt+enter智能提示
    //在同一个包下给出一个访问方式
    //两个方法：都说公开public

    //构造器    此处为什么要构造一个无参构造器，是因为主函数里面调用了一个无参创建实例
    public T01a() {

    }
    //此时构造器打印的内容就跳过了封装
    public T01a(String name, int age) {
        this.name = name;
        this.age = age;
        //所以我们可以把setName方法写在构造器里面
        setName(this.name);
        setAge(this.age);
        //也可以直接写setName(name)，但最好删掉this.name=name
    }

    //1.赋值
    public void setName(String name){
        this.name = name;
        System.out.println("你已进入setName");
    }

    //2.取值
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age<0){
            //System.out.println("你设置的年龄不对，小于0");
            this.age=0;
        }else{
            this.age = age;
        }
        //System.out.println("已经赋值为"+this.age);
    }

    //写一个方法返回属性信息
    public String info(){
        return ("name:"+name+",age:"+age);
    }
}
