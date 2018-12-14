package com.qyj.qyjcloud.qyjcloudauth.mapper;

import com.qyj.qyjcloud.qyjcloudauth.entity.RoleEntity;

import java.util.List;

/**
 * 用户角色Mapper
 * @author shitl
 */
public interface RoleMapper {

    /**
     * 根据用户ID查询用户角色
     * @param userId
     * @return
     */
    List<RoleEntity> listRoleByUserId(Long userId);
}
