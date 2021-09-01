package com.example.txdemo06.service;

import com.example.txdemo06.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
// 添加事务注解
//@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    // 注入dao
    @Autowired
    private UserDao userDao;

    // 转账的方法
    public void accountMoney(){
        // lucy少100
        userDao.reduceMoney();

        // 模拟异常
        int i = 10 / 0;

        // mary多100
        userDao.addMoney();
    }
}
