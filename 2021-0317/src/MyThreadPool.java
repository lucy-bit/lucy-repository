import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -17
 * Time: 13:22
 */
public class MyThreadPool {
    private int nThreads;//记录允许创建的最大线程数
    private List<Thread> threads;//工作线程
    private BlockingQueue<Runnable> workQueue;//任务阻塞队列
}
