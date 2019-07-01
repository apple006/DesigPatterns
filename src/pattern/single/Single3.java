package pattern.single;

/**
 * 单例模式-高效懒加载实现
 * 针对Single2的多线程方式改进，双重校验锁实现，更加高效的线程安全的实现方式
 */
public class Single3 {
    //
    public volatile static Single3 instance;

    //私有化构造方法 这样保证该类无法通过new实例化
    private Single3() {
    }

    /**
     * 获取实例,高效且线程安全
     */
    public static Single3 getInstance() {
        if (instance == null) {
            synchronized (Single3.class) {
                if (instance == null) {
                    instance = new Single3();
                }
            }
        }
        return instance;
    }


}
