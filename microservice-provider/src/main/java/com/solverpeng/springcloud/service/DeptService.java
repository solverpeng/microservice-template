package com.solverpeng.springcloud.service;


import com.solverpeng.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
