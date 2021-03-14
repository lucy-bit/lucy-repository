/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -14
 * Time: 23:50
 */
public class TestDemo {
    class MyCircularQueue {
        private int front;
        private int rear;
        private int[] elem;
        /** Initialize your data structure here. Set the size of the queue to be k. */
        public MyCircularQueue(int k) {
            this.elem = new int[k+1];
            this.front = 0;
            this.rear = 0;
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            //判断数组是否已经满
            if(isFull()) {
                return false;
            }
            //如果没满，在rear下标里存放数据，rear++
            this.elem[this.rear] = value;
            this.rear = (this.rear+1) % this.elem.length;

            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            //出队列的话从front出
            //直接让front向后走就可以
            if(isEmpty())
                return false;

            this.front = (this.front+1) % this.elem.length;
            return true;
        }

        /** Get the front item from the queue. */
        public int Front() {
            if(isEmpty())
                return -1;
            return this.elem[this.front];
        }

        /** Get the last item from the queue. */
        public int Rear() {
            if(isEmpty())
                return -1;
            //注意：不能直接返回rear下标元素，因为在入队列后rear向后走了一位，
            //也不能直接rear--，因为rear可能在队头位置
            int index = (this.rear == 0) ? this.elem.length-1 : this.rear-1;
            return this.elem[index];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            //如果rear和front相等——为空
            if(this.rear == this.front)
                return true;
            return false;
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            if((this.rear+1) % this.elem.length == this.front)
                return true;
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
}
