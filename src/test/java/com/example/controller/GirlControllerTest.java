package com.example.controller;

import com.example.domain.Result;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * @author lyz
 * @date 2017-11-11
 */
@SpringBootTest
@RunWith(value = SpringRunner.class)
@AutoConfigureMockMvc
public class GirlControllerTest {

    @Autowired
    private MockMvc mvc;
    @Test
    public void list() throws Exception {
    }

    @Test
    public void girlAdd() throws Exception {
    }

    @Test
    public void girlFindOne() throws Exception {
    }

    @Test
    public void girlUpdate() throws Exception {
    }

    @Test
    public void getGirl() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girls/getGirl/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}