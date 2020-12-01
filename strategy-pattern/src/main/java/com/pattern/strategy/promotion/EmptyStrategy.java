package com.pattern.strategy.promotion;

/**
 * Created by wangzhengpeng
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
