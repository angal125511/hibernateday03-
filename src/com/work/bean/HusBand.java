package com.work.bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/10
 * Time: 19:09
 */
public class HusBand { //丈夫

    private Integer id;
    private String name;

    private Wife wife;

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public HusBand() {
    }

    public HusBand(Integer id, String name, Wife wife) {
        this.id = id;
        this.name = name;
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "HusBand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wife=" + wife +
                '}';
    }
}
