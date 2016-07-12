/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2016 All Rights Reserved.
 */
package org.seckill.dto;

import java.io.Serializable;

/**
 * 暴露秒杀地址DTO
 *
 * @author cheng
 * @version Id: Exposer.java, v 0.1 2016/7/9 15:50 cheng Exp $$
 */
public class Exposer implements Serializable{

    //是否开启秒杀
    private boolean exposed;

    //一种加密措施
    private String  md5;

    //秒杀id
    private long    seckillId;

    //系统当前时间（毫秒）
    private long    now;

    //开启时间
    private long    start;

    //结束时间
    private long    end;

    public Exposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.end = end;
        this.start = start;
    }

    public Exposer(boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Exposer{" + "exposed=" + exposed + ", md5='" + md5 + '\'' + ", seckillId="
               + seckillId + ", now=" + now + ", start=" + start + ", end=" + end + '}';
    }
}
