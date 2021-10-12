package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class tbl_parse_params_lib_conversions {
    private int id;
    private int paramID;
    private int order;
    private int conversionID;
    private String conversion;
    private String param1;
    private String param2;
    private String remark;
}
