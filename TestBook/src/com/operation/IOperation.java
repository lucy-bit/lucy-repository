package com.operation;

import com.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 21:37
 */

//因为所有类都要操作这个数组，每次都new一个数组的话很不方便，所以创建一个接口
public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(BookList bookList);
    //Alt + Enter之后会出现 import com.book.BookList
}
