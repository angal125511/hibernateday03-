package com.work.test;

import com.work.bean.HusBand;
import com.work.bean.Wife;
import com.work.formwork.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/10
 * Time: 19:50
 */
public class HWTest {

    Session session = null;

    @Before
    public void before(){ // 之前

        // 获取session
        session = HibernateUtil.getSession();

        // 开启事物
        session.beginTransaction();
    }

    @After
    public void after(){ // 之后
        // 事物提交
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void addHW(){
        Wife wife = new Wife(); // 添加wife
        wife.setName("谢娜");

        HusBand husBand = new HusBand(); // 添加HusBand
        husBand.setName("张杰");

        husBand.setWife(wife);
        wife.setHusBand(husBand);

        session.save(husBand);
    }
}
