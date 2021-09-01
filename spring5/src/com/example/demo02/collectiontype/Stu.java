package com.example.demo02.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * IOC操作bean管理：xml注入集合属性
 *      1.注入数组类型属性
 *      2.注入list集合类型属性
 *      3.注入map类型集合属性
 *      4.注入set类型集合属性
 */
public class Stu {
    // 1.数组类型属性
    private String[] courses;
    // 2.list集合类型属性
    private List<String> list;
    // 3.map类型集合属性
    private Map<String, String> maps;
    // 4.set类型集合属性
    private Set<String> sets;

    // 学生所学多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    // 生成set方法
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);

        System.out.println(courseList);
    }
}
