package com.example.demo02.factorybean;

import com.example.demo02.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * Ioc操作bean管理：FactoryBean（工厂bean）
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        // 定义返回bean
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
