package com.work.bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/10
 * Time: 19:10
 */
public class Wife { // 妻子

    private Integer id;
    private String name;

    private HusBand husBand;

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

    public HusBand getHusBand() {
        return husBand;
    }

    public void setHusBand(HusBand husBand) {
        this.husBand = husBand;
    }

    public Wife() {
    }

    public Wife(Integer id, String name, HusBand husBand) {
        this.id = id;
        this.name = name;
        this.husBand = husBand;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", husBand=" + husBand +
                '}';
    }
}
