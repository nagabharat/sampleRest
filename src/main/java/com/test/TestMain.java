package com.test;

import java.util.concurrent.*;

/**
 * Created by synycs on 13/9/16.
 */
public class TestMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadFactory threadFactory=Executors.privilegedThreadFactory();
//        ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
//
//       Future f= executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i=0;i<5;i++) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("hi "+1);
//                }
//            }
//        });
//
//        f.get();
//
//
//        executorService.shutdown();

        User user=new User("ss","ss");
        change( user);

        System.out.println(user.getPassword());





    }

    public static void change( User user){
       user=new User("sd","sd");
    }
}
