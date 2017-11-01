package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author lyz
 * @date 2017-11-1
 */
public interface GrilRepository extends JpaRepository<Gril,Integer>{

    List<Gril> findByAge(Integer age);
}
