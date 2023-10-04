package service;

import repository.RepoA;
import repository.RepoB;
import repository.RepoC;

public class ServiceC {

    private ServiceB serviceB;
    private RepoC repoC;

    public ServiceC(ServiceB serviceB, RepoC repoC) {
        this.serviceB = serviceB;
        this.repoC = repoC;
    }

    public void methodC(){
        System.out.println("class ServiceC method called");
        serviceB.methodB();
        repoC.methodC();
    }
}
