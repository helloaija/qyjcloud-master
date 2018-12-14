package com.qyj.qyjcloud.qyjcloudauth.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * 角色实体
 * @author shitl
 */
public class RoleEntity implements GrantedAuthority {

    private Long id;

    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
