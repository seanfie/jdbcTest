package com.neuedu.mainbtest.pojo;

public class Teacher {
    private int sid;
    private String tname;
    private String tpassword;
    private int sfalg;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public int getSfalg() {
        return sfalg;
    }

    public void setSfalg(int sfalg) {
        this.sfalg = sfalg;
    }

    public Teacher() {
    }

    public Teacher(int sid, String tname, String tpassword, int sfalg) {
        this.sid = sid;
        this.tname = tname;
        this.tpassword = tpassword;
        this.sfalg = sfalg;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "sid=" + sid +
                ", tname='" + tname + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", sfalg=" + sfalg +
                '}';
    }
}
