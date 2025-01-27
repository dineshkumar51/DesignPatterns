package com.designpatterns;

import com.designpatterns.proxy.WorkerProxy;

/*
It provides a surrogate or placeholder for another object to control access to it.
 */

public class Main {

    public static void main(String[] args) {
        WorkerProxy worker = new WorkerProxy();
        worker.doSomething();
    }
}
