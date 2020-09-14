import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -14
 * Time: 19:29
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;
    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        for(int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
    private boolean isFull() {
       /* if(this.usedSize == this.elem.length)
            return true;
        return false;*/
       return this.usedSize == this.elem.length;
    }
    //在 pos 位置新增元素
    public void add(int pos,int data) {
        //如果数组已经满了，进行二倍扩容,并将原数组中的内容拷贝进去
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        if(pos<0 || pos> this.usedSize) {
            return;
        }
        int i =  this.usedSize-1;
        while(i >= pos) {
            this.elem[i+1] =  this.elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind)
                return true;
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind) {
        return Arrays.binarySearch(this.elem,toFind);
    }

    //获取 pos 位置对应的元素
    public int getPos(int pos) {
        if(this.usedSize == 0) {
            throw new RuntimeException("顺序表为空");
        }
        if(pos < 0 || pos > usedSize) {
            return -1;
        }
        return this.elem[pos];
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
       if(index == -1) {
           System.out.println("没有要删除的关键字");
           return;
       }
       for(int i = index; i < this.usedSize-1; i++) {
           this.elem[i] = this.elem[i+1];
       }
       this.usedSize--;
    }
}


