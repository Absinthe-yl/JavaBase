package Java_Mind_mapping.exception异常.throw自定义异常.自定义测试题;
/*
1）自定义一个异常类NoThisSoundException和Player类，在Player的play()方法中使用自定义异常，要求入下：
2）NoThisSongException继承Exception类，类中有一个无参和一个接收一个String类型参数的构造方法，
    构造方法中都使用super关键字调用父类的构造方法。
3）Player类中定义一个play(int index)方法，方法接收一个int类型的参数，表示播放歌曲的索引，当index>10时，
    paly()方法用throw关键字抛出NoThisSongException异常，创建异常对象时，调用有参的构造方法，传入“您播放的歌曲不存在”。
4）在测试类中创建Player对象，并调用play()方法测试自定义的NoThisSongException异常，
    使用try…catch语句捕获异常，调用NoThisSongException的getMessage()方法打印出异常信息。
 */
public class T04 {
    public static void main(String[] args) {
        player p1=new player();
        try {
            p1.play(11);
        } catch (NoThisSoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
class NoThisSoundException extends Exception{
    public NoThisSoundException(){
        super();
    }
    public NoThisSoundException(String s){
        super(s);
    }
}
class player{
    public void play(int index) throws NoThisSoundException{
        if (index > 10) {
            throw new NoThisSoundException("您播放的歌曲不存在");//这里是getMessage的赋值地点
        }
        System.out.println("歌曲存在");
    }
}
