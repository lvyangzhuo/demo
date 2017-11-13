package com.example.service;

import com.example.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lyz
 * @date 2017-11-2
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{

   SysUser findByUsername(String username);
}