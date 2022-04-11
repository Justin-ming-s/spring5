package com.jsm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  11:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;
    private String bname;
    private String bstatus;
}
