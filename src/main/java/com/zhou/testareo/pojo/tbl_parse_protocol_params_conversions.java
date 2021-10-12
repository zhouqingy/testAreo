package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbl_parse_protocol_params_conversions {
    private int id;
    private int PID;
    private int paramID;
    private int order;
    private int conversionID;
    private String conversion;
    private String param1;
    private String param2;
    private String remark;
}
