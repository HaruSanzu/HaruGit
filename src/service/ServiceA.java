package service;

import repository.RepoA;

public class ServiceA {
    private RepoA repoA;

    public ServiceA(RepoA repoA) {
        this.repoA = repoA;
    }

    public void methodA(){
        System.out.println("class ServiceA method called");
        repoA.methodA();
    }
}
