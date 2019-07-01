package pattern.single;

/**
 * 调用单例模式，创建对象
 */
public class SingleTest {

    public static void main(String[] args) {

        Single1 single1 = Single1.getInstance();
        System.out.println(single1);

        Single2 instance = Single2.getInstance();
        Single2 instance1 = Single2.getInstance(true);

    }
}
