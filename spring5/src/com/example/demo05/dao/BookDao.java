package com.example.demo05.dao;

import com.example.demo05.entity.Book;

import java.util.List;

public interface BookDao {

    // 添加的方法
    void add(Book book);

    // 修改的方法
    void updateBook(Book book);

    // 删除的方法
    void delete(String id);

    // 查询的方法
    int selectCount();

    // 查询某个对象
    Book findBookInfo(String id);

    // 查询集合
    List<Book> findAllBook();

    // 批量添加
    void batchAddBook(List<Object[]> batchArgs);

    // 批量修改
    void batchUpdateBook(List<Object[]> batchArgs);

    // 批量删除
    void batchDeleteBook(List<Object[]> batchArgs);
}
