package com.book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 21:23
 */
public class BookList {
   // public int books;
    //顺序表里只能放整型数据
   // Book[] books = new Book[10];

    //按照顺序表的方法来定义
    public Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        //this.books = new Book[10];

        //或者在外面定义
        books[0] = new Book("三国演义","罗贯中",56,"小说");
        books[1] = new Book("西游记","吴承恩",76,"小说");
        books[2] = new Book("水浒传","施耐庵",96,"小说");
        this.usedSize = 3;

    }

    public void setBooks() {

    }

    public Book getBook(int pos) {
        return books[pos];//假设下标合法，就是一个顺序表
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
