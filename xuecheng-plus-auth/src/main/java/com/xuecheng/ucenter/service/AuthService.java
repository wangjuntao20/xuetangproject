package com.xuecheng.ucenter.service;

import com.xuecheng.ucenter.model.dto.AuthParamsDto;
import com.xuecheng.ucenter.model.dto.XcUserExt;

/**
 * @Description 统一认证接口
 * @Classname AuthService
 * @Date 2024/2/22 17:29
 * @Created by wangjuntao
 */
public interface AuthService {

    public XcUserExt execute(AuthParamsDto authParamsDto);
}
