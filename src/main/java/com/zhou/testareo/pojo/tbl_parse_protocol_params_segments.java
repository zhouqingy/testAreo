package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbl_parse_protocol_params_segments {
    private int id;
    private int PID;
    private int paramID;
    private int row;
    private int startbyte;
    private int length;
}
