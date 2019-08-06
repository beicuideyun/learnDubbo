package com.yun.provider.provider;

public class DemoServicelmpl implements DemoService {
    public String sayHello(String name){
        return "Welcome to cloud's Dubbo, Hello " + name;
    }
}
