package com.example.demo.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component

public class SchedulerTest {




        private int count=0;

        private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

       // @Scheduled(cron="*/6 * * * * ?")

        private void process(){

            System.out.println("this is scheduler task runing  "+(count++));

        }


       // @Scheduled(fixedRate = 6000)
        public void reportCurrentTime() {

            System.out.println("现在时间：" + dateFormat.format(new Date()));

        }




}
