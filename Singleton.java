package offer程序题;
//单例模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
public class Singleton {
    private Singleton() {}
    private static Singleton singleton= null;
	public static Singleton getSingleton(){
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
