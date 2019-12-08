package com.atlihao.cloud.service;

import com.atlihao.cloud.domain.User;

import java.util.List;

/**
 * @author lihao
 * @ClassName UserService
 * @Since 2019/12/8
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
