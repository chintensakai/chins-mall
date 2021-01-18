package com.chins.chinsmall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chins.chinsmall.product.entity.PmsCategory;
import com.chins.chinsmall.product.mapper.PmsCategoryMapper;
import com.chins.chinsmall.product.service.IPmsCategoryService;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory> implements
    IPmsCategoryService {

  @Autowired
  private PmsCategoryMapper categoryMapper;

  @Override
  public Object listWithTree() {
    List<PmsCategory> pmsCategories = categoryMapper.selectList(null);
    List<PmsCategory> pCollect = pmsCategories.stream().filter(c -> c.getParentCid() == 0)
        .map(pCategory -> {
          pCategory.setSubCategories(assembSubCategories(pCategory, pmsCategories));
          return pCategory;
        })
        .sorted(Comparator.comparingInt(PmsCategory::getSort))
        .collect(Collectors.toList());

    return pCollect;
  }

  /***
   * 递归组装子菜单
   *
   * @param pCategory
   * @param allCategories
   * @return
   */
  private List<PmsCategory> assembSubCategories(PmsCategory pCategory,
      List<PmsCategory> allCategories) {
    List<PmsCategory> collect = allCategories.stream().filter(c ->
        c.getParentCid() == pCategory.getCatId())
        .map(c -> {
          c.setSubCategories(assembSubCategories(c, allCategories));
          return c;
        })
        .sorted(Comparator.comparingInt(PmsCategory::getSort))
        .collect(Collectors.toList());
    return collect;
  }
}
