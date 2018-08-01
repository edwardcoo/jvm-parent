package com.edc.jvm;

/**
 * Created by Mtime on 2018/8/1.
 */
public class HelloJvm {

    public static void main(String[] args) {
        for (int i = 0;i<100000000;i++){
            Integer[] datas = new Integer[32*1024];
            System.out.println(i+"---"+datas.length);
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {

            }
        }
    }

}
