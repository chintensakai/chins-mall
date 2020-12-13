package com.chins.chinsmall.coupon.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券领取历史记录
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsCouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 会员名字
     */
    private String memberNickName;

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    private Boolean getType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    private Boolean useType;

    /**
     * 使用时间
     */
    private LocalDateTime useTime;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单号
     */
    private Long orderSn;


}
