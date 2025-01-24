package com.designpatterns.proxy;

public class WorkerProxy extends Worker{

   private final Worker worker;

   public WorkerProxy(){
       worker = new Worker();
   }

   @Override
    public void doSomething() {
       //We can lazy instantiation of worker if needed
       System.out.println("Proxy Preprocessing");
       this.worker.doSomething();
       System.out.println("Proxy Postprocessing");
   }
}
