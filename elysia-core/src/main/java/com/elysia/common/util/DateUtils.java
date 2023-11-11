package com.elysia.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    private static final String CUSTOM_FORMAT = "yyyy-MM-dd";// 通常的日期格式化格式2000-00-00
    private static final String DETAIL_FORMAT = "yyyy-MM-dd HH:mm:ss";// 带时间详情的格式方式2000-00-00
    private static final String SHORT_YEAR_FORMAT = "yy-MM-d HH:mm";// 采取年简短月简短，不显示秒

    private static final String LSH_FORMAT = "yyyyMMdd";// 简洁的格式化方式20000000
    private static final String DETAIL_LSH_FORMAT = "yyyyMMddHHmmss";// 带有详情的时间格式化方式
    private static final String SHORT_FORMAT = "yyMMdd";// 简短的时间格式方式000000
    private static final String NS_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
    private static SimpleDateFormat customFormat = new SimpleDateFormat(CUSTOM_FORMAT);
    private static SimpleDateFormat detailFormat = new SimpleDateFormat(DETAIL_FORMAT);
    private static SimpleDateFormat lshDateFormat = new SimpleDateFormat(LSH_FORMAT);
    private static SimpleDateFormat detailLSHFormat = new SimpleDateFormat(DETAIL_LSH_FORMAT);
    private static SimpleDateFormat shortFormat = new SimpleDateFormat(SHORT_FORMAT);
    private static SimpleDateFormat nsFormat = new SimpleDateFormat(NS_FORMAT);
    private static SimpleDateFormat shortYearFormat = new SimpleDateFormat(SHORT_YEAR_FORMAT);

    /**
     * 返回通常的日期格式：yyyy-MM-dd
     *
     * @param date 传入一个日期
     * @return
     */
    public synchronized static String customFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return customFormat.format(date);
        }
    }

    /**
     * 返回日期的详细格式：yyyy-MM-dd HH:mm:ss
     *
     * @param date 传入一个日期
     * @return
     */
    public static String detailFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return detailFormat.format(date);
        }
    }

    /**
     * 返回默认的流水号使用的日期格式：yyyyMMdd
     *
     * @param date
     * @return
     */
    public synchronized static String lshFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return lshDateFormat.format(date);
        }
    }

    /**
     * 返回详细的流水号中使用的日期格式:yyyyMMddHHmmss
     *
     * @param date
     * @return
     */
    public synchronized static String detailLSHFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return detailLSHFormat.format(date);
        }
    }

    /**
     * 返回简单的日期格式：yyMMdd
     *
     * @param date
     * @return
     */
    public synchronized static String shortFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return shortFormat.format(date);
        }
    }

    /**
     * 返回两位数的年份的日期格式不显示秒，主要用于当两个时间相差很大时显示15-12-3 15:25
     *
     * @param date
     * @return
     */
    public synchronized static String shortYearFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return shortYearFormat.format(date);
        }
    }

    /**
     * 返回包含纳秒的日期格式：yyyy-MM-dd HH:mm:ss.S
     *
     * @param date
     * @return
     */
    public synchronized static String nsFormat(Date date) {
        if (date == null) {
            return "";
        } else {
            return nsFormat.format(date);
        }
    }

    /**
     * 为日期增加年数
     *
     * @param date 日期
     * @param year 年数，可以为负
     * @return
     */
    public static Date addYear(Date date, int year) {
        if (date == null) {
            return null;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }

    /**
     * 为日期增加天数
     *
     * @param date 日期
     * @param day  天数，可以为负
     * @return
     */
    public static Date addDay(Date date, int day) {
        if (date == null) {
            return null;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, day);
        return calendar.getTime();
    }

    /**
     * 为日期增加月数
     *
     * @param date  日期
     * @param month 月，可以为负
     * @return
     */
    public static Date addMonth(Date date, int month) {
        if (date == null) {
            return null;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * 为日期增加小时数
     *
     * @param date 日期
     * @param hour 小时，可以为负
     * @return
     */
    public static Date addHour(Date date, int hour) {
        if (date == null) {
            return null;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hour);
        return calendar.getTime();
    }

    /**
     * 为日期增加分钟数
     *
     * @param date   日期
     * @param minute 分钟，可以为负
     * @return
     */
    public static Date addMinute(Date date, int minute) {
        if (date == null) {
            return null;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minute);
        return calendar.getTime();
    }

    /**
     * 为日期增加秒数
     *
     * @param date   日期
     * @param second 钞，可以为负
     * @return
     */
    public static Date addSecond(Date date, int second) {
        if (date == null) {
            return null;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, second);
        return calendar.getTime();
    }

    /**
     * 设置天
     *
     * @param date   时间
     * @param second 秒
     * @return
     */
    public static Date setDay(Date date, int day) {
        if (day < 0) {
            day = 0;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    /**
     * 设置小时
     *
     * @param date 时间
     * @param hour 小时
     * @return
     */
    public static Date setHour(Date date, int hour) {
        if (hour < 0) {
            hour = 0;
        } else if (hour > 23) {
            hour = 23;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        return calendar.getTime();
    }

    /**
     * 设置分钟
     *
     * @param date   时间
     * @param minute 分钟
     * @return
     */
    public static Date setMinute(Date date, int minute) {
        if (minute < 0) {
            minute = 0;
        } else if (minute > 59) {
            minute = 59;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, minute);
        return calendar.getTime();
    }

    /**
     * 设置秒
     *
     * @param date   时间
     * @param second 秒
     * @return
     */
    public static Date setSecond(Date date, int second) {
        if (second < 0) {
            second = 0;
        } else if (second > 59) {
            second = 59;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.SECOND, second);
        return calendar.getTime();
    }

    /**
     * 设置毫秒
     *
     * @param date        时间
     * @param millisecond 秒
     * @return
     */
    public static Date setMillisecond(Date date, int millisecond) {
        if (millisecond < 0) {
            millisecond = 0;
        } else if (millisecond > 999) {
            millisecond = 999;
        }
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DST_OFFSET, millisecond);
        return calendar.getTime();
    }

    /**
     * 向下取整到天，即删除时、分、秒
     *
     * @param date 时间
     * @return
     */
    public static Date round(Date date) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    /**
     * 把yyyy-MM-dd HH:mm:ss 的字符串转化为日期
     *
     * @param str
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String str) throws ParseException {
        if (str == null) {
            return null;
        }

        synchronized (detailFormat) {
            return detailFormat.parse(str);
        }

    }

    public static Date nsDate(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        synchronized (nsFormat) {
            return nsFormat.parse(str);
        }
    }

    /**
     * 根据传入的时间 和当前的时间进行比较.
     *
     * @param microsecond 1分钟=60*1000 60分钟=1小时=60*60*1000 10小时=24*60*60*1000
     *                    5天=5*24*60*60*1000
     * @return
     */
    public static String getTimeConversion(long microsecond) {
        long mDurtionTime = System.currentTimeMillis() - microsecond;
        if (mDurtionTime < 60 * 1000) {
            return String.valueOf(Math.abs(mDurtionTime / 1000)) + "秒前";
        } else if (mDurtionTime < 60 * 60 * 1000) {
            return String.valueOf(mDurtionTime / (60 * 1000)) + "分钟前";
        } else if (mDurtionTime < 24 * 60 * 60 * 1000) {
            return String.valueOf(mDurtionTime / (60 * 60 * 1000)) + "小时前";
        } else if (mDurtionTime < 10 * 24 * 60 * 60 * 1000) {
            return String.valueOf(mDurtionTime / (24 * 60 * 60 * 1000)) + "天前";
        } else {
            return getDateTime(microsecond);
        }

    }

    /**
     * 1分钟=60*1000 1小时=60分钟=60*60*1000 1天=24*60*60*1000
     * *如果时间戳相差十分钟就显示刚刚，一小时之内的显示分钟数，一天内显示小时数，5天之内的显示天数，否则显示简短日期
     *
     * @param microsecond
     * @return
     */
    public static String getTimeSocial(long microsecond) {
        long mDurtionTime = System.currentTimeMillis() - microsecond;
        if (mDurtionTime < 10 * 60 * 1000) {
            return "刚刚";
        } else if (mDurtionTime < 60 * 60 * 1000) {
            return String.valueOf(mDurtionTime / (60 * 1000)) + "分钟前";
        } else if (mDurtionTime < 24 * 60 * 60 * 1000) {
            return String.valueOf(mDurtionTime / (60 * 60 * 1000)) + "小时前";
        } else if (mDurtionTime < 5 * 24 * 60 * 60 * 1000) {
            return String.valueOf(mDurtionTime / (24 * 60 * 60 * 1000)) + "天前";
        } else {
            return getshortDateTime(microsecond);
        }

    }

    public static String getDateTime(long microsecond) {
        return detailFormat(new Date(microsecond));
    }

    /**
     * 当时间相差过长时设置简短的年份显示
     *
     * @param microsecond
     * @return
     */
    public static String getshortDateTime(long microsecond) {
        return shortYearFormat(new Date(microsecond));
    }

    public static String getTimeStamp(String pastDate) throws ParseException {
        Date past = parseDate(pastDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(past);
        String stamp = getTimeConversion(cal.getTimeInMillis());
        return stamp;
    }

    /**
     * 显示类社交媒体的时间格式与当前时间相比较
     *
     * @param pastDate 为过去的日期字符串类型
     * @return
     * @throws ParseException
     */
    public static String getSocialTimeStamp(String pastDate) throws ParseException {
        Date past = parseDate(pastDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(past);
        String stamp = getTimeSocial(cal.getTimeInMillis());
        return stamp;
    }
}

