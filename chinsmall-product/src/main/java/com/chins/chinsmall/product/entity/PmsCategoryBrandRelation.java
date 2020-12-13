package com.chins.chinsmall.product.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 品牌分类关联
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsCategoryBrandRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 分类id
     */
    private Long catelogId;

    private String brandName;

    private String catelogName;


}
