package com.edc.jvm;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mtime on 2018/8/2.
 */
public class JvmBlockDemo {
    static Logger logger = Logger.getLogger(JvmBlockDemo.class);

    private static List<int[]> bigObj = new ArrayList<int[]>();
    private static List<char[]> bigCharObj = new ArrayList<char[]>();

    public static int[] generate1M(){
        return new int[1024 * 1024/4];
    }
    public static int[] generate4M(){
        return new int[1024 * 1024];
    }
    public static int[] generate10M(){
        return new int[1024 * 1024*10/4];
    }

    public static int[] generate1MChar(){
        return new int[1024 * 1024/2];
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i =0;i<1000;i++){
            if(i==0){
                Thread.sleep(500L);
                System.out.println("start="+new Date());
                logger.info("start====>"+new Date());
            }else{
                Thread.sleep(2000L);
            }
            System.out.println("第"+(i+1)+"次");
            bigObj.add(generate4M());
        }
    }

}
