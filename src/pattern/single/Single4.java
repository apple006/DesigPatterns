package pattern.single;

/**
 * 单例模式-内部类方式实现
 * <p>
 * 使用内部类实现
 * 利用了java的类加载机制，类装载时单线程创建对象
 * 而且类加载时，Single4被加载了，SingleHolder类没有被加载，
 * 只有通过显式调用getInstance()方法时，对象才会实例化，
 * 完美实现了懒加载，适合对象实例化非常耗费资源的情况
 */
public class Single4 {
    //私有化内部类
    private static class SingleHolder {
        private static final Single4 INSTANCE = new Single4();
    }

    //私有化静态方法
    private Single4() {
    }

    /**
     * 获取对象实例方法
     */
    public static Single4 getInstance() {
        return SingleHolder.INSTANCE;
    }

}
