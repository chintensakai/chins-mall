package com.chins.chinsmall.member.controller;


import com.chins.chinsmall.member.feign.ICouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@RestController
@RequestMapping("/member/ums-member")
public class UmsMemberController {

  @Autowired
  private ICouponFeignService couponFeignService;

  @GetMapping("/testFeign")
  public Object testFeign() {
    Object coupons = couponFeignService.memberCoupons();
    return coupons;
  }

}
