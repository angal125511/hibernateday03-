package com.work.entity;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/10
 * Time: 19:09
 */
public class Employee { // 员工

    private Integer id;
    private String name;

    private JoinPart joinPart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JoinPart getJoinPart() {
        return joinPart;
    }

    public void setJoinPart(JoinPart joinPart) {
        this.joinPart = joinPart;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, JoinPart joinPart) {
        this.id = id;
        this.name = name;
        this.joinPart = joinPart;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joinPart=" + joinPart +
                '}';
    }
}
