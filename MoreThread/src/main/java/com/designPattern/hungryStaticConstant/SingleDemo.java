package com.designPattern.hungryStaticConstant;

public class SingleDemo {

    /**
     * private 加private的原因：如果不加private则可以通过Single.s来获得Single对象，并且此时连getInstance()方法都可以删除
     *                          但是使用getInstance()方法来获得Single对象可以实现可控；
     * static 加static的原因：因为getInstance()方法是静态的，静态方法只能调用静态变量；
     * final 加final的原因：因为这里的s是固定不变的，所以加final修饰
     */
    private static final SingleDemo s = new SingleDemo();

    private SingleDemo() {
    }

    public static SingleDemo getInstance() {
        return s;
    }
}
