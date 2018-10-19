package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2018/10/18.
 */
@RestController
public class ProviderController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/product")
    public String product(String name) {
        return "Services: " + discoveryClient.getServices() + "name :" + name;
    }

}
