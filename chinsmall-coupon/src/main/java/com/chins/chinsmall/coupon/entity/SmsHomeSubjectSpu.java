package com.chins.chinsmall.coupon.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 专题商品
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsHomeSubjectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专题名字
     */
    private String name;

    /**
     * 专题id
     */
    private Long subjectId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 排序
     */
    private Integer sort;


}
