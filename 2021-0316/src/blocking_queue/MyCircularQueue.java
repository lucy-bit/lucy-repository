package blocking_queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -16
 * Time: 22:35
 */
class MyCircularQueue {
    private int[] elem;
    private int front;
    private int rear;
    public MyCircularQueue(int k) {
        elem = new int[k+1];
        front = 0;
        rear  = 0 ;
    }

    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        elem[rear] = value;
        rear = (rear+1)%elem.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        front = (front+1)%elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return elem[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(rear == 0) {
            return elem[elem.length-1];
        }
        return elem[rear-1];
    }

    public boolean isEmpty() {
        if(rear == front) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if((rear+1)%elem.length == front) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */