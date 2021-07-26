package PTA;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args) {
        HasStatic hasStatic1 = new HasStatic();
        List<Judge> list1 = new ArrayList<>();
        hasStatic1.setList(list1);
        List<singleOption> list2 = new ArrayList<>();
        HasStatic hasStatic2 = new HasStatic();
        hasStatic2.setList(list2);
    }
//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            public void run() {
//                // 把run方法里的内容换成你要执行的内容
//                SimpleDateFormat sdf = new SimpleDateFormat("2021-07-21 21:21:00");
//                System.out.println("当前的系统时间为：" + sdf.format(new Date()));
//            }
//        };
//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        //public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);
//        //command--执行的任务,initialDelay--延迟开始,period--间隔时间,unit--时间单位
//        service.scheduleAtFixedRate(runnable, 0, 5, TimeUnit.SECONDS);
//
//    }

}