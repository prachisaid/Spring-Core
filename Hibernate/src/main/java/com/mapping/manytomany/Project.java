package com.mapping.manytomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table(name = "project")
public class Project {
    
    @Id
    private int pid;
    
    private String pname;
    
    @ManyToMany(mappedBy = "projects")
    private List<Emp> emps;

    public Project() {
    }

    public Project(int pid, String pname, List<Emp> emps) {
        this.pid = pid;
        this.pname = pname;
        this.emps = emps;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
    
    
}
