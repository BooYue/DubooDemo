package com.edu;

public class DemoService implements IDemoService {
    @Override
    public String invoke() {
        System.out.println("执行了invoke方法");
        return "哈喽 Dubbo!";
    }
}
