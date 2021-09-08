package org.itstack.demo.design;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq awardReq) {
        String reqJson = JSON.toJSONString(awardReq);
        AwardRes awardRes = null;

        try {
            logger.info("奖品开始发放{}， req：{}", awardReq.getuId(), reqJson);
            if (awardReq.getAwardType() == 1) {
                CouponService couponService = new CouponService();

            }
        }

    }
}
