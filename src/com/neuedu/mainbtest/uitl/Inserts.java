package com.neuedu.mainbtest.uitl;


import com.neuedu.mainbtest.test.Conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Inserts {
    private Scanner input = new Scanner(System.in);

    public void insert(){

        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        System.out.println("请输入要添加的学生学号");
        String no = input.next();
        System.out.println("请输入要添加的学生姓名");
        String name = input.next();
        System.out.println("请输入要添加的学生密码");
        String pass = input.next();
        System.out.println("请输入要添加的学生性别");
        String sex = input.next();
        System.out.println("请输入要添加的学生年龄");
        String age = input.next();
        System.out.println("请输入要添加的学生出生年月");
        String birthday = input.next();
        System.out.println("请输入要添加的学生身高");
        String height = input.next();
        System.out.println("请输入要添加的学生体重");
        String weight = input.next();

        String sql = "insert into student values sno='"+no+"',sname='"+name +"',spsw='"+pass+"',ssex='"+sex+"',sage="+age+",sbirthday='"+birthday+"',sheight="+height+",sweight="+weight+",sfalg=1";

        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            int is = state.executeUpdate(sql);
            System.out.println(is);
            System.out.println("添加成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
