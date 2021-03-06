package com.bjsxt.factory.abstractFactory;

public interface Engine {
    void  run();
    void start();
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("涡轮增压");
    }

    @Override
    public void start() {
        System.out.println("涡轮增压！可以自动启停");
    }
}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("启动慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢！不可以自动启停");
    }
}