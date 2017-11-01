package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lyz
 * @date 2017-11-1
 */
@RestController
public class GrilController {

    @Autowired
    private GrilRepository grilRepository;

    @GetMapping(value = "list")
    public List<Gril> list(){
        return grilRepository.findAll();
    }

    @PostMapping(value = "save")
    public Gril save(Gril gril){
        return this.grilRepository.save(gril);
    }

    @GetMapping(value = "findByAge/{age}")
    public List<Gril> findByAge(@PathVariable(value = "age") Integer age){
        return this.grilRepository.findByAge(age);
    }
}
