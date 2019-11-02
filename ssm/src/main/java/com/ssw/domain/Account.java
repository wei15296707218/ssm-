package com.ssw.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther:Wss
 * @Date:2019/11/1 0001
 * @Description:com.ssw.domain
 * @version: 1.0
 */
@Data
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;


}
