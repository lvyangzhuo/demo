package com.example.controller;

import com.example.domain.Girl;
import com.example.domain.Result;
import com.example.service.GirlRepository;
import com.example.service.GirlService;
import com.example.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author lyz
 * @date 2017-11-11
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping("/girls")
    public List<Girl> list() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls/add")
    public Result girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(bindingResult.getFieldError().getDefaultMessage(), -1);
        }
        return ResultUtil.success(girlRepository.save(girl));
    }

    /**
     * 查询一个女生
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable(value = "id") Long id) {
        return girlRepository.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable(value = "id") Long id,
                           @RequestParam(value = "age") Integer age,
                           @RequestParam(value = "cupSize") String cupSize) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setId(id);
        girl.setAge(age);
        return null;
    }


    @GetMapping("/girls/getGirl/{id}")
    public Result getGirl(@PathVariable("id") Long id) {
        return ResultUtil.success(girlService.getGirl(id));
    }


}
