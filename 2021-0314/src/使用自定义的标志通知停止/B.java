package 使用自定义的标志通知停止;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -14
 * Time: 15:18
 */
public class B extends Thread{
    private Condition condition;
    B(Condition condition) {
        this.condition = condition;
    }
    public void run() {

        while(condition.running) {
            Thread thread = currentThread();
            System.out.println(thread.getId() + " ：挖煤");
        }
    }
    /*private Condition condition;
    B(Condition condition) {
        this.condition = condition;
    }
    @Override
    public void run() {
        while(condition.running) {
            Thread thread = currentThread();
            System.out.println(thread.getId()+" : 挖煤");
        }
    }*/
}
