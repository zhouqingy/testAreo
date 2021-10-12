package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbl_log {
    private int id;
    private Date time_stamp;
    private String level;
    private String message;
    private String stacktrace;
}
