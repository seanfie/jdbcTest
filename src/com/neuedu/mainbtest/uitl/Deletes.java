package com.neuedu.mainbtest.uitl;


import com.neuedu.mainbtest.test.Conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deletes {
    private Scanner input = new Scanner(System.in);

    public void delete(){

        System.out.println("请输入要删除的学生姓名");
        String name = input.next();

        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;

        String sql = "delete from student where sname='"+name+"'";

        try {
            conn = new Conn().getconnection();
            state = conn.createStatement();
            int dl = state.executeUpdate(sql);
            System.out.println(dl);
            System.out.println("删除成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
