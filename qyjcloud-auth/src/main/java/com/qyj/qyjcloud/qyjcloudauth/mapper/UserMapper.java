package com.qyj.qyjcloud.qyjcloudauth.mapper;

import com.qyj.qyjcloud.qyjcloudauth.entity.UserEntity;

/**
 * 用户DAO
 * @author shitl
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    UserEntity findByUsername(String username);

    /**
     * 根据用户ID查询用户信息
     * @param user
     * @return
     */
    UserEntity getUserByUserId(Long user);
}
