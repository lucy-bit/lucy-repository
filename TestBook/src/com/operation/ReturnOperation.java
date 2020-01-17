package com.operation;

import com.book.Book;
import com.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 21:37
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        //1、查找图书是否存在
        System.out.println("输入要归还的书名：");
        String name = scan.next();
        int i = 0;
        Book book = null;
        //遍历数组
        for(; i < bookList.getUsedSize(); i++) {
            book =bookList.getBook(i);
            if(book.getName().equals(name) ){
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("没有此书");
            return;
        }
       if(book.isBorrowed()) {
            book.setBorrowed(false);
           System.out.println("归还成功");
       }else {
           System.out.println("该书没有被借阅");
       }
    }
}
