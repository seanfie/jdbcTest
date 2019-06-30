package com.neuedu.mainbtest.pojo;

public class Student {
    private Integer sid;
    private String sno;
    private String sname;
    private String spsw;
    private String ssex;
    private int sage;
    private String sbirthday;
    private int sheight;
    private int sweight;
    private int sfalg;

    public int getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpsw() {
        return spsw;
    }

    public void setSpsw(String spsw) {
        this.spsw = spsw;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public int getSheight() {
        return sheight;
    }

    public void setSheight(int sheight) {
        this.sheight = sheight;
    }

    public int getSweight() {
        return sweight;
    }

    public void setSweight(int sweight) {
        this.sweight = sweight;
    }

    public int getSfalg() {
        return sfalg;
    }

    public void setSfalg(int sfalg) {
        this.sfalg = sfalg;
    }

    public Student() {
    }


    public Student(Integer sid, String sno, String sname, String spsw, String ssex, int sage, String sbirthday, int sheight, int sweight, int sfalg) {
        this.sid = sid;
        this.sno = sno;
        this.sname = sname;
        this.spsw = spsw;
        this.ssex = ssex;
        this.sage = sage;
        this.sbirthday = sbirthday;
        this.sheight = sheight;
        this.sweight = sweight;
        this.sfalg = sfalg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", spsw='" + spsw + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                ", sbirthday='" + sbirthday + '\'' +
                ", sheight=" + sheight +
                ", sweight=" + sweight +
                ", sfalg=" + sfalg +
                '}';
    }
}
