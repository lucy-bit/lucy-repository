package v3;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -29
 * Time: 21:00
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*User u1 = new User(1,"陈老师","男");
        User u2 = new User(2,"汶汶老师","女");*/

        //将 u1 和 u2的对应的对象序列化，并写入到文件内部
        String filename = "C:\\Users\\86187\\Java\\实现简易的HTTP服务器\\sessions\\users.obj";
        /*try(OutputStream outputStream = new FileOutputStream(filename)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(u1);
            objectOutputStream.writeObject(u2);

            objectOutputStream.flush();
        }*/

        try(InputStream inputStream = new FileInputStream(filename)) {

            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            User u1 = (User)objectInputStream.readObject();
            User u2 = (User)objectInputStream.readObject();

            System.out.println(u1);
            System.out.println(u2);
        }
    }

}
