package com.neuedu.mainbtest.uitl;


import com.neuedu.mainbtest.pojo.Student;
import com.neuedu.mainbtest.test.Conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Selects {
    private Scanner input = new Scanner(System.in);

    public void select(){
        List<Student> list = new ArrayList<>();

        System.out.println("请输入要查询的学生姓名");
        String name = input.next();

        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        String sql = "select * from student where sname='"+name+"'";

        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            rs = state.executeQuery(sql);

            while (rs.next()){
             int sid = rs.getInt("sid");
             String sno = rs.getString("sno");
             String sname = rs.getString("sname");
             String spsw = rs.getString("spsw");
             String ssex = rs.getString("ssex");
             int sage = rs.getInt("sage");
             String sbirthday = rs.getString("sbirthday");
             int sheight = rs.getInt("sheight");
             int sweight = rs.getInt("sweight");
             int sfalg = rs.getInt("sfalg");
             Student stu = new Student(sid,sno,sname,spsw,ssex,sage,sbirthday,sheight,sweight,sfalg);
             list.add(stu);
                for (Student s:list
                     ) {
                    System.out.println(s);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rs,state,conn);
        }


    }


    public static void close(ResultSet rs, Statement state, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (state != null){
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
