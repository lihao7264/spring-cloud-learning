package com.atlihao.cloud.service.impl;

import com.atlihao.cloud.domain.CommonResult;
import com.atlihao.cloud.domain.User;
import com.atlihao.cloud.service.UserService;
import org.springframework.stereotype.Component;


/**
 * 服务降级实现类
 *
 * @author lihao
 * @ClassName UserFallbackService
 * @Since 2019/12/8
 */
@Component
public class UserFallbackService implements UserService {
    @Override
    public CommonResult create(User user) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getByUsername(String username) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult update(User user) {
        return new CommonResult("调用失败，服务被降级", 500);
    }

    @Override
    public CommonResult delete(Long id) {
        return new CommonResult("调用失败，服务被降级", 500);
    }
}
