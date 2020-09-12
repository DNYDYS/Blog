package com.blog.common.utils.date;


import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 * @desc: 时间工具类可以使用 JodaTime /  Hutool.DateTime
 * @param null
 * @return: null
 * @author: maiBangMin
 * @date: 2020/9/10 10:53 下午
 */
public class TimeUtil {

    public static void main(String[] args) {

        // 1.获取当前时间
        DateTime dateTime = new DateTime();
        System.out.println(dateTime);

        // 2.指定时间
        DateTime ontTime = new DateTime(1472457422728L);
        System.out.println(ontTime);

        // 3.时间格式化
        DateTime format = new DateTime();
        format = DateTime.parse("2020-08-08");
        System.out.println(format);

        // 4.计算两个时间间隔的天数(开始时间必须早于结束时间)
        LocalDate start = new DateTime().toLocalDate();
        LocalDate end = new LocalDate(2020, 10, 01);
        System.out.println(Days.daysBetween(start, end).getDays());

        // 5.针对某一个时间单位进行调整(时间单位满足进位时会自动进位)
        DateTime timeUnit = new DateTime();
        timeUnit = timeUnit.plusDays(21);
        System.out.println(timeUnit.toString());

        // 6.判断是否为闰月
        DateTime isOrNot = new DateTime();
        DateTime.Property property = isOrNot.monthOfYear();
        System.out.println(property.isLeap());
    }
}
