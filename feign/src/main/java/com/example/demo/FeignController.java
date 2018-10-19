package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Admin on 2018/10/18.
 */
@RestController
public class FeignController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-hi");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/product?name=jaycekon";
        System.out.println(url);
        return new RestTemplate().getForObject(url, String.class);
    }
}
