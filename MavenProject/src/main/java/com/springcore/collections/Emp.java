package com.springcore.collections;
import java.util.*;

public class Emp {
    private String name;
    private List<Integer> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties props;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPhones() {
        return phones;
    }

    public void setPhones(List<Integer> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Emp{" + "name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + ", props=" + props + '}';
    }
    
    
}
