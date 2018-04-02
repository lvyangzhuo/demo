package com.example.controller;

import com.example.service.GirlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author lyz
 * @date 2017-12-19
 */
@Controller
@RequestMapping("/test/")
@Slf4j
public class TestController {

//    @Autowired
    //private DiscoveryClient client;

    @Autowired
    private GirlService girlService;

    @RequestMapping("/hello")
    @ResponseBody
    public String thread() {
        System.out.println("进来了");
        return "hello word";
    }


    @RequestMapping("/thread")
    @ResponseBody
    public String thread1() {
        for (int i = 0; i < 100000; i++) {
            doThread(i);

        }
        return "hello word";
    }

    @Async
    public void doThread(int i) {
        log.info("数字：" + i);
    }

}
