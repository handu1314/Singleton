/**
 * 饿汉模式
 * 由于类加载时已经对实例对象进行了初始化，所以获取实例时时线程安全的
 * Created by Administrator on 2017/3/14.
 */
public class TestSingleton2 {
    //在类加载时完成初始化
    private static TestSingleton2 testSingleton = new TestSingleton2();
    //私有构造方法
    private TestSingleton2(){}
    //通过静态方法获取静态实例
    public static TestSingleton2 getInstance(){
        return testSingleton;
    }

    public static void main(String[] args) {
        TestSingleton2 singleton1 = TestSingleton2.getInstance();
        TestSingleton2 singleton2 = TestSingleton2.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
