package com.example.demo05.test;

import com.example.demo05.entity.Book;
import com.example.demo05.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    /**
     * 测试数据库 -- >增删改查
     */
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo05/bean1.xml"
        );
        BookService bookService = context.getBean("bookService", BookService.class);

        // 1.插入数据
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book); // 把book对象传进去

        // 2.修改数据
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("oracle");
//        book.setUstatus("b");
//        bookService.updateBook(book);

        // 3.删除数据
//        bookService.deleteBook("1");

        // 4.查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);

        // 5.查询返回对象
//        Book one = bookService.findOne("1");
//        System.out.println(one);

        // 6.查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        // 7.批量添加数据
//        List<Object[]> batchArgs  = new ArrayList<>();
//        Object[] o1 = {"3", "java", "a"};
//        Object[] o2 = {"4","c++","b"};
//        Object[] o3 = {"5","MySQL","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

        // 8.批量修改数据库中的文件
//        List<Object[]> batchArgs  = new ArrayList<>();
//        Object[] o1 = { "javac", "a0", "3"};
//        Object[] o2 = {"c++21","b1", "4",};
//        Object[] o3 = {"MySQL34","c2", "5",};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchUpdate(batchArgs);

        // 8.批量删除
        List<Object[]> batchArgs  = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};

        batchArgs.add(o1);
        batchArgs.add(o2);
        // 调用方法实现批量修改
        bookService.batchDelete(batchArgs);
    }

}
