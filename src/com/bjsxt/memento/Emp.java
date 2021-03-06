package com.bjsxt.memento;

/**
 * 源发器类
 */
public class Emp {
private String ename;
private int age;
private double salary;

//进行备忘操作，并返回备忘录对象
    public EmpMemeto memento(){
        return new EmpMemeto(this);
    }

    //进行数据恢复，恢复成制定备忘录对象的值
    public void recovery(EmpMemeto mmt){
        this.ename = mmt.getEname();
        this.age=mmt.getAge();
        this.salary=mmt.getSalary();

    }

    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
