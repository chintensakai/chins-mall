package com.chins.chinsmall.ware.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 仓库信息
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WmsWareInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 仓库名
     */
    private String name;

    /**
     * 仓库地址
     */
    private String address;

    /**
     * 区域编码
     */
    private String areacode;


}
