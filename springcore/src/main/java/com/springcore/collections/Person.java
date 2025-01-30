package com.springcore.collections;

import java.util.*;

public class Person {
    private int id;
    private List<String> friends;
    private Set<String> accounts;
    private Map<Integer, String> edu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Set<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<String> accounts) {
        this.accounts = accounts;
    }

    public Map<Integer, String> getEdu() {
        return edu;
    }

    public void setEdu(Map<Integer, String> edu) {
        this.edu = edu;
    }

    public Person(int id, List<String> friends, Set<String> accounts, Map<Integer, String> edu) {
        this.id = id;
        this.friends = friends;
        this.accounts = accounts;
        this.edu = edu;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", friends=" + friends + ", accounts=" + accounts + ", edu=" + edu + '}';
    }
    
    
    
}
