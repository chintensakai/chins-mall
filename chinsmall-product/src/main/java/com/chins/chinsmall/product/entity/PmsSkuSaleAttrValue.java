package com.chins.chinsmall.product.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * sku销售属性&值
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsSkuSaleAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * attr_id
     */
    private Long attrId;

    /**
     * 销售属性名
     */
    private String attrName;

    /**
     * 销售属性值
     */
    private String attrValue;

    /**
     * 顺序
     */
    private Integer attrSort;


}
