package com.example.service;

import com.example.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author lyz
 * @date 2017-11-2
 */
public class CustomUserService implements UserDetailsService{

    @Autowired
    private SysUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        SysUser user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }
}
