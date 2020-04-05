package com.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-19
 * Time: 21:10
 */

/**
 * 接口和接口  extends
 */
interface A {
    void funcA();
}
interface B {
    void funcB();
}
interface D extends A,B{//extends扩展
    void funcD();
}
class F implements D{
    @Override
    public void funcA() {

    }
    @Override
    public void funcB() {

    }
    @Override
    public void funcD() {

    }
}

//.........
class C implements A,B {

    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}
public class TestDemo5 {
    public static void main(String[] args) {

    }
}
