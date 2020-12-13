package com.chins.chinsmall.order.service.impl;

import com.chins.chinsmall.order.entity.OmsOrder;
import com.chins.chinsmall.order.mapper.OmsOrderMapper;
import com.chins.chinsmall.order.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author chins
 * @since 2020-12-13
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
