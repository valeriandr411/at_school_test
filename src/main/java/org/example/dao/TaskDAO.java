package org.example.dao;

import org.example.model.Task;

import java.util.List;

public interface TaskDAO {

    public void create(Task task);
    public List<Task> findByPipeline(String pipeline);
}
