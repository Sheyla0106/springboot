package com.xl.springBootDemo.controller.seckill;

import com.xl.springBootDemo.common.RedisLock;
import com.xl.springBootDemo.service.seckill.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/24 23:40
 * @Modified By：
 */
@RestController
@RequestMapping("sec")
public class SeckillController {
    public static final Logger log = LoggerFactory.getLogger(SeckillController.class);

    @Autowired
    private SeckillService seckillService;

    @GetMapping("/{productId}")
    public String buyProduct(@PathVariable String productId) {
        log.info(seckillService.querySecKillProductInfo(productId));

        seckillService.orderProductMocckDiffUser(productId);
        String result = seckillService.querySecKillProductInfo(productId);
        log.info(result);
        return result;

    }
}
