package com.operation;

import com.book.Book;
import com.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 21:36
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        System.out.println("请输入要借阅的书籍");
        String name = scan.next();
        int i = 0;
        Book book = null;
        //遍历数组
        for(; i < bookList.getUsedSize(); i++) {
            book = bookList.getBook(i);
            if(book.getName().equals(name) ){
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("没有此书");
            return;
        }
        //book = bookList.getBook(i);
        if(book.isBorrowed()) {
            System.out.println("此书已经被借出");
        }else {
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
