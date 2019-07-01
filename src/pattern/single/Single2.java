package pattern.single;

/**
 * 单例模式-懒加载实现
 * 改进Single1，初次获取对象的时候再创建对象，节省内存
 */
public class Single2 {
    //
    public static Single2 instance;

    //私有化构造方法 这样保证该类无法通过new实例化
    private Single2() {
    }

    /**
     * 获取实例
     * 线程不安全
     */
    public static Single2 getInstance() {
        if (instance == null) {
            instance = new Single2();
        }
        return instance;
    }

    /**
     * 获取实例
     * 线程安全的方式
     */
    public static synchronized Single2 getInstance(Boolean threadSafety) {
        if (instance == null) {
            instance = new Single2();
        }
        return instance;
    }

}
