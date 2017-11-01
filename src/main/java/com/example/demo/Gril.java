package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author lyz
 * @date 2017-11-1
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gril {

    @Id
    @GeneratedValue
    private int id;

    private int age;

    private String name;
}
