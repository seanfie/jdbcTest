package com.neuedu.mainbtest.pojo;

import com.neuedu.mainbtest.test.Conn;
import com.neuedu.mainbtest.test.Show;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManager {

    private Scanner input = new Scanner(System.in);

    public void login(){

            Connection conn = null;
            Statement state = null;
            ResultSet rs = null;

            System.out.println("请输入用户名:");
            String name = input.next();
            System.out.println("请输入密码:");
            String password = input.next();

            String sql = "select spsw from student where sname='"+name+"'";

            try {
                conn = new Conn().getconnection();
                state = conn.createStatement();
                rs = state.executeQuery(sql);
                if (rs.next()){

                    if (password.equals(rs.getString("spsw"))){
                        System.out.println("恭喜同学,登陆成功");
                        new Show().showment();
                    }else {
                        System.out.println("用户名或密码错误,请重新输入");
                    }
                }
            }
                catch (SQLException e) {
                e.printStackTrace();
            }finally {
                close(rs,state,conn);
            }
        }

    public static void close(ResultSet rs,Statement state,Connection conn){
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
