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
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        System.out.println("输入要查找的书名：");
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
        System.out.println(book);
        System.out.println("找到此书");

    }
}
