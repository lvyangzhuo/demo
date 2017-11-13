package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author lyz
 * @date 2017-11-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Girl implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Min(value = 18,message = "未满18岁")
    private Integer age;

    private String cupSize;

}
