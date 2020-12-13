package com.chins.chinsmall.member.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 成长值变化历史记录
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsGrowthChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * create_time
     */
    private LocalDateTime createTime;

    /**
     * 改变的值（正负计数）
     */
    private Integer changeCount;

    /**
     * 备注
     */
    private String note;

    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    private Integer sourceType;


}
