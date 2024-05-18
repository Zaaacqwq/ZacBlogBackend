package com.zaaac.utils;

import com.zaaac.domain.entity.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {

    /**
     * 获取用户
     **/
    public static LoginUser getLoginUser() {
        Authentication authentication = getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof LoginUser) {
            return (LoginUser) authentication.getPrincipal();
        }
        return null; // or throw an exception
    }

    /**
     * 获取Authentication
     */
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static Boolean isAdmin() {
        LoginUser loginUser = getLoginUser();
        if (loginUser != null && loginUser.getUser() != null) {
            Long id = loginUser.getUser().getId();
            return id != null && 1L == id;
        }
        return false;
    }

    public static Long getUserId() {
        LoginUser loginUser = getLoginUser();
        if (loginUser != null && loginUser.getUser() != null) {
            return loginUser.getUser().getId();
        }
        return null;
    }
}
