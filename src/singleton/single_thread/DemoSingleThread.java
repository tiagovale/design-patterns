package singleton.single_thread;
public class DemoSingleThread {
    public static void main(String[] args) {
    	
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}