package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbl_parse_params_lib {
    private int id;
    private String title;
    private int datatype;
    private int length;
    private String remark;
}
