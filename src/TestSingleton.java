/**
 * 懒汉模式
 * 线程不安全
 *
 * Created by Administrator on 2017/3/14.
 */
public class TestSingleton {
    //私有构造方法
    private TestSingleton(){}
    //声明静态的单例对象
    private static TestSingleton testSingleton = null;
    //静态锁
    private static Object syncObj = new Object();
    //通过调用静态方法获取实例对象
    public static TestSingleton getInstance(){
        //判断静态变量是否被创建
        if(testSingleton == null){
            //加同步锁
            synchronized (syncObj){
                //二次判断静态变量是否被创建
                if(testSingleton == null){
                    testSingleton = new TestSingleton();
                }
            }
        }
        return testSingleton;
    }

    public static void main(String[] args) {
        TestSingleton singleton1 = TestSingleton.getInstance();
        TestSingleton singleton2 = TestSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
