package org.itstack.demo.design;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.coupon.CouponResult;
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
                CouponResult couponResult = couponService.sendCoupon(awardReq.getuId(), awardReq.getAwardNumber(), awardReq.getBizId());
                if ("000".equals(couponResult.getCode()))
                    awardRes = new AwardRes("000", "发放成功！");
                else
                    awardRes = new AwardRes("0001", couponResult.getInfo());

            } else if (awardReq.getAwardType() == 2) {

            }

        } catch (Exception e) {
            logger.error("奖品发放失败");
        }
        return null;

    }
}
