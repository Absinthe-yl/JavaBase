package Java_Mind_mapping.exception异常.try_catch_finally;

//(1)多个异常可以用多个catch捕获
//(2)要求子类捕获必须在父类前面
public class try_catchs_finally {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person =null;
            System.out.println(person.getName());//NullPointerException空指针异常
            int n1=10;
            int n2=0;
            int res=n1/n2; //ArithmeticException数组运算异常
        } catch(NullPointerException e){
            System.out.println("空指针异常="+e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("算数异常="+e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
        }
    }
}


class Person{
    private String name;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}