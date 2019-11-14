package com.example.csc250_fall2019_employeemanager;

public class Employee
{
    private String fname;
    private String lname;
    private int height_feet;
    private int height_inches;
    private int age;
    private double weight;

    public Employee(String fname, String lname, int height_feet, int height_inches, int age, double weight)
    {
        this.fname = fname;
        this.lname = lname;
        this.height_feet = height_feet;
        this.height_inches = height_inches;
        this.age = age;
        this.weight = weight;
    }

    public String employeeGreeting()
    {
        return(fname + " " + lname + " " + height_feet + " " + height_inches + " " + age + " " + weight);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getHeight_feet() {
        return height_feet;
    }

    public void setHeight_feet(int height_feet) {
        this.height_feet = height_feet;
    }

    public int getHeight_inches() {
        return height_inches;
    }

    public void setHeight_inches(int height_inches) {
        this.height_inches = height_inches;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
