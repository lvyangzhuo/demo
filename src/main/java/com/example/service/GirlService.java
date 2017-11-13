package com.example.service;

import com.example.domain.Girl;
import com.example.enums.ResultEnum;
import com.example.exception.GirlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lyz
 * @date 2017-11-11
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public Girl getGirl(Long id) {
        Girl girl = this.girlRepository.findOne(id);
        if (girl.getAge() < 18) {
            throw new GirlException(ResultEnum.NO_18);
        } else if (girl.getAge() < 13) {
            throw new GirlException(ResultEnum.NO_13);
        } else {
            return girl;
        }
    }
}
