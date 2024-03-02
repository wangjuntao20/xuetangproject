package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;

/**
 * @Description 分页查询分页参数
 * @Classname PageParams
 * @Date 2024/2/4 17:06
 * @Created by wangjuntao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {

    //当前页码
    @ApiModelProperty("页码")
    private Long  pageNo = 1L ;
    //每页显示记录数
    @ApiModelProperty("每页显示记录数")
    private Long pageSize = 10L ;
}
