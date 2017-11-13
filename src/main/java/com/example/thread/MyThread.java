package com.example.thread;

import java.util.Date;

/**
 * @author lyz
 * @date 2017-11-13
 */
public class MyThread extends Thread{

    private Date creationDate;

    private Date startDate;

    private Date finishDate;

    public MyThread(Runnable runnable,String name){
        super(runnable,name);
    }
}
