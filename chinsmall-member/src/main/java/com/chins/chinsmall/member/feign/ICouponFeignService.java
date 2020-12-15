package com.chins.chinsmall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("chinsmall-coupon")
public interface ICouponFeignService {

  @RequestMapping("/coupon/sms-coupon/test/member/coupons")
  Object memberCoupons();
}
