package blocking_queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -16
 * Time: 21:53
 */
public class circleQueue {
    private static final int CAPACITY = 16;
    private int[] queue = new int[CAPACITY];
    private int frontIndex = 0;
    private int rearIndex = 0;
    private int size = 0;
    //放入队列
    public void put(int element) {
        if(size == queue.length) {
            throw new RuntimeException("队列已满");
        }

        //队列中还有空间

    }
}
