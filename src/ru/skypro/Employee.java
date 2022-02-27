package ru.skypro;

public class Employee {
    private static int count;
    String fullName;
    int otdel;
    double salary;
    private int id;

    public Employee (String fullName, int otdel, double salary) {
        this.fullName = fullName;
        this.otdel = otdel;
        this.salary = salary;
        count++;
        id = count;
    }
    public static int getCount() {
        return count;
    }
    public String getFullName() {
        return fullName;
    }
    public int setOtdel() {
        return otdel;
    }
    public void setOtdel(int otdel){
        this.otdel = otdel;
    }
    public double setSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", otdel=" + otdel +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}