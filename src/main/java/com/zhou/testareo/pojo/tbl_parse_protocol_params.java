package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class tbl_parse_protocol_params {
    private int id;
    private int PID;
    private int param_lib_ID;
    private String title;
    private int datatype;
    private int length;
    private String remark;
    private String sampling;
    private int issigned;
    private int ischangebyteorder;
    private int positiontype;
    private int isquwei;
    private int quwei_param;
    private int ispingbi;
    private int pingbi_param;
    private int isyiwei;
    private int yiwei_param_direction;
    private int yiwei_param_count;
    private int is_jiaozheng;
    private int showmode;


}
