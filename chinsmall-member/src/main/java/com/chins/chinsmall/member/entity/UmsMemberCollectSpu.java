package com.chins.chinsmall.member.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员收藏的商品
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsMemberCollectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;

    /**
     * spu_img
     */
    private String spuImg;

    /**
     * create_time
     */
    private LocalDateTime createTime;


}
