package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String alias;
    private String name;
    private String pipeline;
    private String branch;
    private String repository;

    protected Task() {
    }

    public Task(String alias, String name, String pipeline, String branch, String repository) {
        this.alias = alias;
        this.name = name;
        this.pipeline = pipeline;
        this.branch = branch;
        this.repository = repository;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getAlias() {
        return alias;
    }

    public String getName() {
        return name;
    }

    public String getPipeline() {
        return pipeline;
    }

    public String getBranch() {
        return branch;
    }

    public String getRepository() {
        return repository;
    }

    @Override
    public String toString() {
        return "[id = " + id +
                ", alias = " + alias +
                ", name = " + name +
                ", pipeline = " + pipeline +
                ", branch = " + branch +
                ", repository = " + repository + "]";
    }
}
