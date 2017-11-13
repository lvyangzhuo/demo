package com.example.service;

import com.example.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lyz
 * @date 2017-11-11
 */
public interface GirlRepository extends JpaRepository<Girl,Long> {
}
