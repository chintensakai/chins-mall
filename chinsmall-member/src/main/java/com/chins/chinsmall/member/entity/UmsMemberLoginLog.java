package com.chins.chinsmall.member.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员登录记录
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsMemberLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * ip
     */
    private String ip;

    /**
     * city
     */
    private String city;

    /**
     * 登录类型[1-web，2-app]
     */
    private Boolean loginType;


}
