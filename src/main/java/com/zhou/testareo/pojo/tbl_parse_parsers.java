package com.zhou.testareo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbl_parse_parsers {
    private int id;
    private String title;
    private String IP;
    private String SourceIP;
    private int SourcePort;
    private int PID;

}
