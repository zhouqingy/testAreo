package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbl_parse_protocol_lib {
    private int id;
    private String title;
    private int subframenum;
    private int subframelength;
    private String synword;
    private String remark;
}
