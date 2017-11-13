package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lyz
 * @date 2017-11-2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Msg {

    private String title;

    private String content;

    private String etraInfo;
}
