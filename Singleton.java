package offer������;
//����ģʽ�漰��һ����һ���࣬���ฺ�𴴽��Լ��Ķ���ͬʱȷ��ֻ�е������󱻴�����������ṩ��һ�ַ�����Ψһ�Ķ���ķ�ʽ������ֱ�ӷ��ʣ�����Ҫʵ��������Ķ���
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
