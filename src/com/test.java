package com;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class test {

        private int topicsetId;
        private Timer timer;
        private Timestamp ktime ;

    public test() {
    }

    public test(int topicsetId, Timer timer, Timestamp ktime) {
        this.topicsetId = topicsetId;
        this.timer = timer;
        this.ktime = ktime;
    }

    public int getTopicsetId() {
        return topicsetId;
    }

    public void setTopicsetId(int topicsetId) {
        this.topicsetId = topicsetId;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Timestamp getKtime() {
        return ktime;
    }

    public void setKtime(Timestamp ktime) {
        this.ktime = ktime;
    }

    @Override
    public String toString() {
        return "test{" +
                "topicsetId=" + topicsetId +
                ", timer=" + timer +
                ", ktime=" + ktime +
                '}';
    }

    public static void main(String[] args) {
        test t = new test();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(t.ktime);
        Date time = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        },time);
    }

}
