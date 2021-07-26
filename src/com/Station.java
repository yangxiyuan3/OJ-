package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Station {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("`````````程序开始运行```````````");
        Date date1 = new Date();

        int taskSize = 5;
        ;
        //创建一个大小为5的线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);

        List<Future> list = new ArrayList<Future>();

        for (int i = 0; i < taskSize; i++) {
            Callable c = new MyCallable(i + "");
            Future f = pool.submit(c);
            list.add(f);
        }
        pool.shutdown();

        for (Future f : list) {
            System.out.println(">>>" + f.get().toString());
        }

        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间【"
                + (date2.getTime() - date1.getTime()) + "毫秒】");
    }
//    @Override
//    public void run() {
//        System.out.println("MyThread.run()");
//    }
//
//    public static void main(String[] args) {
//        Station myThread = new Station();
//
//        Thread thread = new Thread(myThread);
//
//        thread.start();
//    }
}
