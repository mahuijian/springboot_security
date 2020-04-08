package com.mhj.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author mahuijian
 * @since 2020/4/8 15:30
 */
@Getter
@Setter
public class User implements UserDetails{

    private Integer id;

    private Integer orgId;

    private String userName;

    private String password;

    private String salt;

    private String email;

    private String phone;

    private String address;

    private Integer state;

    private String ip;

    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        List<SimpleGrantedAuthority> authorities=new ArrayList<>();
        for (Role role : roles)
        {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
