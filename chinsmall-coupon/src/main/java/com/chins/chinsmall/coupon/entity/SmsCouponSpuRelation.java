package com.chins.chinsmall.coupon.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券与产品关联
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsCouponSpuRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;


}
