package com.elysia.market.order.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.pojo
 * @Author: ElysiaKafka
 * @CreateTime: 2023-11-17  22:38:57
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarketOrderInfo {
    private String id;
    private String orderId;
    private Integer status;
    private String goods;
    private String goodsQuality;
    private String createUser;// 创建用户
    private String createDate;// 创建日期
    private String createTime;// 创建时间
    private String updateUser;// 更新用户
    private String updateDate;// 更新日期
    private String updateTime;// 更新时间
}
