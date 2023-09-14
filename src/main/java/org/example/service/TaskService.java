package org.example.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dao.TaskRepository;
import org.example.model.Task;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Component
public class TaskService {
    private final TaskRepository taskRepository;
    public void addTask(Task task) {
        log.info("Добавлена задача : " + taskRepository.save(task));
    }

    public Task findById(long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> findByPipeline(String pipeline) {
        //return taskRepository.findByPipeline(pipeline);
        return taskRepository.getByPipeline(pipeline);
    }
}
