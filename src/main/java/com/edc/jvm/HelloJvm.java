package com.edc.jvm;

/**
 * Created by Mtime on 2018/8/1.
 */
public class HelloJvm {

    //常量、静态变量
    private final int i = 0;
    private static int k = 0;
    //成员变量
    private Object obj = new Object();
    private int sss = 0;
    private JvmService jvmService;

    //方法==》 栈帧  1.局部变量表，2.操作数栈，3.动态链接，4.出口

    //成员方法
    public void methodOne(int i){ //成员方法 this
        int j = 0;
        int sum = i+j;
        Object acb = obj;
        long start = System.currentTimeMillis();
        methodTwo();
        jvmService = new LinuxJvmServiceImpl();
        jvmService.doSomeThing();//动态链接
        return;//正常、异常出口
    }

    public void methodTwo(){
        System.out.println(123);
    }

    public void methodThree(){
        methodThree();
    }

    public static void main(String[] args) {

    }

}
