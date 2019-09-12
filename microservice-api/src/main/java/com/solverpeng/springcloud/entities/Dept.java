package com.solverpeng.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    // 主键
    private Long deptNo;
    // 部门名称
    private String dname;
    // 来自哪个数据库，微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String db_source;

}
