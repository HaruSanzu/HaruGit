package service;

import repository.RepoA;
import repository.RepoB;
import repository.RepoC;

public class ServiceB {
   private ServiceA serviceA;
   private RepoB repoB;

    public ServiceB(ServiceA serviceA, RepoB repoB) {
        this.serviceA = serviceA;
        this.repoB = repoB;
    }

    public void methodB(){
        System.out.println("class ServiceB method called");
        serviceA.methodA();
        repoB.methodB();
    }
}
