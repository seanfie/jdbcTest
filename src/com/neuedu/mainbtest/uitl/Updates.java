package com.neuedu.mainbtest.uitl;


import com.neuedu.mainbtest.test.Conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Updates {

    private Scanner input = new Scanner(System.in);

    public void update(){
        Connection conn = null;
        Statement state = null;

        System.out.println("请输入修改的条件字段");
        String j = input.next();
        System.out.println("请输入修改的条件值");
        String y = input.next();
        System.out.println("请输入要修改的字段");
        String i = input.next();
        System.out.println("请输入要修改的值");
        String x = input.next();

        String sql = "update student set "+i+"='"+x+"' where "+j+"='"+y+"'";

        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            int up = state.executeUpdate(sql);
            System.out.println(up);
            System.out.println("修改成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(null,state,conn);
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
