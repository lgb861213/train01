package org.example;


//定义Circle类继承Shape抽象类
public class Circle extends Shape{
    //重写继承过来的抽象类
    @Override
    void draw() {
        System.out.println("画圆");
    }
    //重写继承过来的普通方法
    @Override
    protected void description() {
        System.out.println("我是一个圆形");
        super.description();
    }
}
