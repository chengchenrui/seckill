/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2016 All Rights Reserved.
 */
package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

/**
 * @author cheng
 * @version Id: SeckillDao.java, v 0.1 2016/7/5 23:54 cheng Exp $$
 */
interface SeckillDao {

    /**
     * 减库存
     *
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1,表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀对象
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * 
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offet") int offet, @Param("limit") int limit);
}