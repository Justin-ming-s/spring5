package com.jsm.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Auther Justin-ming
 * @Date 2022/3/16  17:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private int id;
    private String name;
}
