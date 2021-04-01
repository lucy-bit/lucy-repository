package demo;

public class GetClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "com.nannan.webapps.dictionary.TranslateServlet";

        Class<?> clazz1 = Class.forName(className);

        ClassLoader classLoader = GetClassDemo.class.getClassLoader();
        Class<?> clazz2 = classLoader.loadClass(className);

//        Class<getClass> clazz = getClass.class;
//
//        // 是 getClass 这个类的类加载器
//        // getClass 这个类是由该类加载器加载进来的
//        ClassLoader classLoader = clazz.getClassLoader();
//
//        classLoader.loadClass("");  // 使用该类加载器，加载其他类
    }
}
