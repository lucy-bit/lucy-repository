//**
 * Created with IntelliJ IDEA.
         * Description:
         * User: GAOBO
         * Date: 2019-11-26
         * Time: 18:00
         */
public class TestDemo {


    public static void main(String[] args) {
        String str1 = "ef";
        String str = "ab"+"cd"+"ef";
    }

    //public native String intern(); C/C++
    /**
     * 如果常量池当中存在将要入池的字符串，直接将常量池当中的
     * 字符串常量的地址返回
     * 如果常量池不存在，那么在常量池当中将该字符串入池。
     * @param args
     */
    public static void main4(String[] args) {
        char[] array = {'a','b','c','d','e','f'};
        String str2 = new String(array).intern();
        String str1 = "abcdef";
        System.out.println(str1 == str2);//true
    }

    public static void main3(String[] args) {
        String str1 = "abcdef";
        String str2 = new String("abcdef");
        System.out.println(str1 == str2);//false
        String str3 = "abc"+"def";//拼接
        System.out.println(str1 == str3);//false  true
        String str4 = "abc"+ new String("def");
        System.out.println(str1 == str4);//false
        String str5 = "abc";
        String str6 = "def";
        String str7 = str5+str6;
        System.out.println(str1 == str7);//false
        String str8 = str5+new String("def");
        System.out.println(str4 == str8);//false
    }

    public static void main2(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        System.out.println(str == str2);//false
        System.out.println(str.equals(str2));
        char[] array = {'a','b','c','d'};
        String str3 = new String(array);
        System.out.println(str == str3);
    }

  /*  public static void main1(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        char[] array = {'a','b','c','d'};
        String str3 = new String(array);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes,1,2);
        System.out.println(str);//abcd
        String str2 = "高";
        byte[] bytes1 = str2.getBytes("Unicode");
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main4(String[] args) {
        String str = "123456";
        System.out.println(func(str));
    }

    public static void main3(String[] args) {
        char[] array = {'a','b','c'};
        String str1 = new String(array);
        System.out.println(str1);
        String str2 = new String(array,1,2);
        System.out.println(str2);
        char ch = str1.charAt(1);
        System.out.println(ch);
        *//*String str = "Hello";
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));*//*

    }

    public static void main2(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //反射-》Class对象-》方法区-》类的信息
        String str = "Hello";//new String("Hello");
        Class cls = String.class;
        Field field = cls.getDeclaredField("value");
        // 将这个字段的访问属性设为 true
        field.setAccessible(true);
        // 把 str 中的 value 属性获取到.
        char[] value = (char[]) field.get(str);
        // 修改 value 的值
        value[0] = 'h';
        System.out.println(str);
    }

    public static void main1(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(0));
        //str = "h" + str.substring(1);
        //str = "hello";
        System.out.println(str);

        //String str1 = "def";
        *//*String str2 = "ab"+"cd"+10;//abcd10
        System.out.println(str2);*//*
    }*/
/*  public static void main1(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        char[] array = {'a','b','c','d'};
        String str3 = new String(array);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes,1,2);
        System.out.println(str);//abcd
        String str2 = "高";
        byte[] bytes1 = str2.getBytes("Unicode");
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main4(String[] args) {
        String str = "123456";
        System.out.println(func(str));
    }

    public static void main3(String[] args) {
        char[] array = {'a','b','c'};
        String str1 = new String(array);
        System.out.println(str1);
        String str2 = new String(array,1,2);
        System.out.println(str2);
        char ch = str1.charAt(1);
        System.out.println(ch);
        *//*String str = "Hello";
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));*//*

    }

    public static void main2(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //反射-》Class对象-》方法区-》类的信息
        String str = "Hello";//new String("Hello");
        Class cls = String.class;
        Field field = cls.getDeclaredField("value");
        // 将这个字段的访问属性设为 true
        field.setAccessible(true);
        // 把 str 中的 value 属性获取到.
        char[] value = (char[]) field.get(str);
        // 修改 value 的值
        value[0] = 'h';
        System.out.println(str);
    }

    public static void main1(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(0));
        //str = "h" + str.substring(1);
        //str = "hello";
        System.out.println(str);

        //String str1 = "def";
        *//*String str2 = "ab"+"cd"+10;//abcd10
        System.out.println(str2);*//*
    }*/
  public static void main(String[] args) {


  }

}

}
