package com.xuecheng.ucenter.service;

import com.xuecheng.ucenter.model.dto.AuthParamsDto;
import com.xuecheng.ucenter.model.dto.XcUserExt;
import com.xuecheng.ucenter.model.po.XcUser;

/**
 * @Description
 * @Classname AuthService
 * @Date 2024/2/22 17:29
 * @Created by wangjuntao
 */
public interface WxAuthService {

    /**
     * description:微信扫码认证，申请令牌，携带令牌查询用户信息，保存用户信息到数据库
     * @Param code:
     * @return: com.xuecheng.ucenter.model.po.XcUser
     */
    public XcUser wxAuth(String code);
}
