package com.mapping.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table(name = "emp")
public class Emp {
    
    @Id
    private int eId;  
    
    private String eName;
    
    @ManyToMany
    @JoinTable
    (
        name = "emp_project", 
        joinColumns = { @JoinColumn(name = "e_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "p_id") }
    )
    List<Project> projects;

    public Emp() {
    }

    public Emp(int eId, String eName, List<Project> projects) {
        this.eId = eId;
        this.eName = eName;
        this.projects = projects;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    
    
}
