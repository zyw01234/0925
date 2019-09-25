package com.zyw.controller;


import com.netflix.appinfo.InstanceInfo;

import com.zyw.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class Test {
    @Autowired
    private RestTemplate restTemplate;


//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/{id}")
    @ResponseBody
    public User queryById(@PathVariable String id){
//        List<ServiceInstance> serviceInstanceList=discoveryClient.getInstances("user-service");
//        ServiceInstance instanceInfo=serviceInstanceList.get(0);
        String url="http://user-service/aa/"+id;

        //  String url="http://localhost:8888/aa/"+id;
        User user=restTemplate.getForObject(url, User.class);
        return user;
    }

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @GetMapping("/consumer/{id}")
//    @ResponseBody
//    public User queryById(@PathVariable String id){
//        List<ServiceInstance> serviceInstanceList=discoveryClient.getInstances("user-service");
//        ServiceInstance instanceInfo=serviceInstanceList.get(0);
//        String url="http://"+instanceInfo.getHost()+":"+instanceInfo.getPort()+"/aa/"+id;
//
//      //  String url="http://localhost:8888/aa/"+id;
//        User user=restTemplate.getForObject(url, User.class);
//        return user;
//    }
//方法2
//    public User queryById(@PathVariable String id){
//        String url="http://localhost:8888/aa/"+id;
//        User user=restTemplate.getForObject(url, User.class);
//        return user;
//    }

}
