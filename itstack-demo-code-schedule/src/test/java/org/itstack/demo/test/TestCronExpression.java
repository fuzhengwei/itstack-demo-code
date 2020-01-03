package org.itstack.demo.test;

import org.quartz.CronExpression;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TestCronExpression {

    public static void main(String[] args) throws ParseException {
        CronExpression cronExpression = new CronExpression("0/5 * * * * ?");
        cronExpression.setTimeZone(TimeZone.getDefault());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));
        System.out.println(simpleDateFormat.format(cronExpression.getTimeAfter(new Date())));

    }

}
