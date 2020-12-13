package com.chins.chinsmall.product.controller;


import com.chins.chinsmall.product.service.IPmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 品牌 前端控制器
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@RestController
@RequestMapping("/product/pms-brand")
public class PmsBrandController {

  @Autowired
  private IPmsBrandService pmsBrandService;

  @GetMapping("/test")
  public Object getAll() {
    return pmsBrandService.list();
  }
}
