package com.chins.chinsmall.order.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 退款信息
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmsRefundInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 退款的订单
     */
    private Long orderReturnId;

    /**
     * 退款金额
     */
    private BigDecimal refund;

    /**
     * 退款交易流水号
     */
    private String refundSn;

    /**
     * 退款状态
     */
    private Boolean refundStatus;

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    private Integer refundChannel;

    private String refundContent;


}
