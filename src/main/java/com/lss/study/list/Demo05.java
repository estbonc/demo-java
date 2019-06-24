package com.lss.study.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/6/24 13:09
 * <p>
 * remark:
 */
public class Demo05 {

    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("张三", 60, 50, 60));
        stuList.add(new Student("李四", 66, 100, 65));
        stuList.add(new Student("王五", 80, 60, 70));
        stuList.add(new Student("赵六", 76, 50, 86));
        stuList.add(new Student("田七", 50, 80, 68));

        // 排序
        Collections.sort(stuList);

        //打印
        for (Student s : stuList) {
            System.out.println(s);
        }


    }

}

class Student implements Comparable<Student> {

    private String name;
    private int chScore;
    private int mathScore;
    private int engScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChScore() {
        return chScore;
    }

    public void setChScore(int chScore) {
        this.chScore = chScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public Student(String name, int chScore, int mathScore, int engScore) {
        super();
        this.name = name;
        this.chScore = chScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", chScore=" + chScore
                + ", mathScore=" + mathScore + ", engScore=" + engScore + "]";
    }

    /**
     * 结果 < 0 ： 说明this应该在前面
     * 结果 == 0 ：说明谁在前面无所谓
     * 结果 > 0 : 说明this应该在后面
     */
    @Override
    public int compareTo(Student o) {
        return this.getChScore() - o.getChScore();
    }


}
