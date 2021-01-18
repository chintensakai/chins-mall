package com.chins.chinsmall.product.controller;


import com.chins.chinsmall.product.service.IPmsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@RestController
@RequestMapping("/product/pms-category")
public class PmsCategoryController {

  @Autowired
  private IPmsCategoryService pmsCategoryService;

  @GetMapping("/list/tree")
  public Object list() {
    return pmsCategoryService.listWithTree();
  }
}
