package com.jsm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  15:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String username;
    private int money;
}
