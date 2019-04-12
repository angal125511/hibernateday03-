package com.work.test;

import com.work.entity.Employee;
import com.work.entity.JoinPart;
import com.work.formwork.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/10
 * Time: 19:27
 */
public class EJTest {

    Session session = null;
    Transaction transaction=null;

    @Before
    public void before(){ // 之前

        // 获取session
        session = HibernateUtil.getSession();

        // 开启事物
        transaction = session.beginTransaction();
    }

    @After
    public void after(){ // 之后

        session.getTransaction().commit(); // 事物提交
        session.close();
    }

    @Test
    public void  addEJ(){
        JoinPart joinPart = new JoinPart(); // 添加党员
        joinPart.setName("预备党员");

        Employee employee = new Employee(); // 添加员工
        employee.setName("小小");

        employee.setJoinPart(joinPart); // 员工入党
        joinPart.setEmployee(employee);

        session.save(employee); // 员工放入session
        session.save(joinPart); // 党员放入session
    }

}
