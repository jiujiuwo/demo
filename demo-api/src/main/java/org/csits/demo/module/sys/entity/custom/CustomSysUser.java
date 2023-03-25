package org.csits.demo.module.sys.entity.custom;

import org.csits.demo.module.sys.entity.SysUser;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

public class CustomSysUser extends SysUser implements UserDetails, CredentialsContainer, Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.getDelFlag() == 0;
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.getDelFlag() == 0;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.getDelFlag() == 0;
    }

    @Override
    public boolean isEnabled() {
        return super.getDelFlag() == 0;
    }

    @Override
    public void eraseCredentials() {
        super.setPassword(null);
    }
}
