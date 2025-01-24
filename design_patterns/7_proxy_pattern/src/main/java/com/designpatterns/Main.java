package com.designpatterns;

import com.designpatterns.proxy.WorkerProxy;

public class Main {

    public static void main(String[] args) {
        WorkerProxy worker = new WorkerProxy();
        worker.doSomething();
    }
}
