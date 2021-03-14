package 使用自定义的标志通知停止;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -14
 * Time: 15:18
 */
public class Main {
    enum Sex {
        男,女;
    }
    public static void main(String[] args) {
      /*  Thread main = Thread.currentThread();
        System.out.println("主线程的id ：" + main.getId( ));
        Condition condition = new Condition();
        B b = new B(condition);
        b.start();*/

      /*Sex sex = Sex.女;
      Sex[] values = Sex.values();
      for(Sex val: values) {
          System.out.println(val);
      }*/

      Thread.State[] val = Thread.State.values();
      for(Thread.State state:val) {
          System.out.println(state);
      }

    }
}
