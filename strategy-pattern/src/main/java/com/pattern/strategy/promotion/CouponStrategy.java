package com.pattern.strategy.promotion;

/**
 * Created by wangzhengpeng
 */
public class CouponStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
