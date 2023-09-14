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

    protected Task() {
    }

    public Task(String alias, String name, String pipeline) {
        this.alias = alias;
        this.name = name;
        this.pipeline = pipeline;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
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


    @Override
    public String toString() {
        return "[id = " + id +
                ", alias = " + alias +
                ", name = " + name +
                ", pipeline = " + pipeline + "]";
    }
}
