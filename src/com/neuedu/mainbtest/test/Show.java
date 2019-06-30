package com.neuedu.mainbtest.test;


import com.neuedu.mainbtest.uitl.Deletes;
import com.neuedu.mainbtest.uitl.Inserts;
import com.neuedu.mainbtest.uitl.Selects;
import com.neuedu.mainbtest.uitl.Updates;

import java.util.Scanner;

public class Show {
    private Scanner input = new Scanner(System.in);
    public void showment(){
        System.out.println("*******欢迎登陆本学生管理系统*******");
        System.out.println("请选择功能:");
        System.out.println("1  查询学生信息");
        System.out.println("2  修改学生信息");
        System.out.println("3  添加学生信息");
        System.out.println("4  删除学生信息");
        System.out.println("5  退出系统");

        int i = input.nextInt();
        switch (i){
            case 1:
                new Selects().select();
                break;
            case 2:
                new Updates().update();
                break;
            case 3:
                new Inserts().insert();
                break;
            case 4:
                new Deletes().delete();
                break;
            case 5:
                System.out.println("******系统已退出******");
                break;
        }


    }
}
