package com.chins.chinsmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chins.chinsmall.product.entity.PmsCategory;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
public interface IPmsCategoryService extends IService<PmsCategory> {

  Object listWithTree();
}
