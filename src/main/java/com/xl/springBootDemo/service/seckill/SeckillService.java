package com.xl.springBootDemo.service.seckill;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/24 23:31
 * @Modified By：
 */
public interface SeckillService {
    String querySecKillProductInfo(String productId);

    void orderProductMocckDiffUser(String productId);
}
