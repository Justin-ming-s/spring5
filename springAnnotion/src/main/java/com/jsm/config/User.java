package com.jsm.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Justin-ming
 * @Date 2022/3/16  17:49
 */
@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
}
