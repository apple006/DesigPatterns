package pattern.single;

/**
 * 单例模式-枚举方式实现
 * 枚举本质上是一个interface，所有的属性都是常量
 * 而且每一个常量都是一个类的对象
 * 所有枚举本身就实现了单例模式
 */
public enum Single5 {
    INSTANCE;
}
