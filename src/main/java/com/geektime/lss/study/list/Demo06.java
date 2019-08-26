package com.geektime.lss.study.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/6/24 13:09
 * <p>
 * remark:
 */
public class Demo06 {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("张三", 60, 50, 60));
        stuList.add(new Student("李四", 66, 100, 65));
        stuList.add(new Student("王五", 80, 60, 70));
        stuList.add(new Student("赵六", 76, 50, 86));
        stuList.add(new Student("田七", 50, 80, 68));

        // 打印
        for (Student s : stuList) {
            System.out.println(s);
        }

        // 按语文分数排序并打印
        System.out.println("语文排序-----------------------------");
        Collections.sort(stuList, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getChScore() - o2.getChScore();
            }
        });

        // 打印
        for (Student s : stuList) {
            System.out.println(s);
        }

        // 按数学分数排序并打印
        System.out.println("数学排序-----------------------------");
        Collections.sort(stuList, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMathScore() - o2.getMathScore();
            }
        });

        // 打印
        for (Student s : stuList) {
            System.out.println(s);
        }
        // 按英语分数排序并打印
        System.out.println("英语排序-----------------------------");
        Collections.sort(stuList, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getEngScore() - o2.getEngScore();
            }
        });

        // 打印
        for (Student s : stuList) {
            System.out.println(s);
        }
    }
}
