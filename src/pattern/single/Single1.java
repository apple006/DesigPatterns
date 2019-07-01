package pattern.single;

/**
 * 单例模式-简单实现
 *
 * 常量方式实现，类加载时就创建对象实例，线程安全，效率高，
 * 但是浪费内存，不管对象是否使用都创建对象
 */
public class Single1 {
    //静态常量 类加载时创建对象实例，只会创建一次
    public static final Single1 INSTANCE = new Single1();

    //私有化构造方法 这样保证该类无法通过new实例化
    private Single1() {
    }

    //获取实例方法，每次返回的都是同一个方法的引用，实现单例模式
    public static Single1 getInstance() {
        return INSTANCE;
    }

}

