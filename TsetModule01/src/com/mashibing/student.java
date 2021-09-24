package com.mashibing;

/**
 * @author: javase
 * @create: 2021/9/24 13:59
 */
public class student {
    private int age;
    private String Name;
    
    public student() {
    }
    
    public student(int age, String name) {
        this.age = age;
        Name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        Name = name;
    }
    
    @Override
    public String toString() {
        return "student{" + "age=" + age + ", Name='" + Name + '\'' + '}';
    }
}
