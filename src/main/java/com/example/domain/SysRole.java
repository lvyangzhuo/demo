package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author lyz
 * @date 2017-11-1
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRole implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
