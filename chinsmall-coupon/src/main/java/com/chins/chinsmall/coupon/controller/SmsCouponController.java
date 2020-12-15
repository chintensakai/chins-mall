package com.chins.chinsmall.coupon.controller;


import com.chins.chinsmall.coupon.entity.SmsCoupon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@RestController
@RequestMapping("/coupon/sms-coupon")
public class SmsCouponController {

  @GetMapping("/test/member/coupons")
  public Object getMemberCoupons() {
    SmsCoupon coupon = new SmsCoupon();
    coupon.setCouponName("hahaha");
    coupon.setCouponType(false);
    return coupon;
  }
}
