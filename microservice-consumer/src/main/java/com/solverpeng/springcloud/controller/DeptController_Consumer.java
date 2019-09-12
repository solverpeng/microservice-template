package com.solverpeng.springcloud.controller;

import com.solverpeng.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {
    private static final String REST_URI_PREFIX = "http://localhost:8081";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public ResponseEntity<Boolean> add(@RequestBody Dept dept) {
        return restTemplate.postForEntity(REST_URI_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public ResponseEntity<Dept> get(@PathVariable Long id) {
        return restTemplate.getForEntity(REST_URI_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public ResponseEntity<List<Dept>> list() {
        return restTemplate.exchange(REST_URI_PREFIX + "/dept/list", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Dept>>(){});
    }

}
