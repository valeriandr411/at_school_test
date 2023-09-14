package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.model.Task;
import org.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/admin")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/hello")
    public String hello() {
        log.info("hello");
        return "hello";
    }

    @PostMapping("/addTask")
    public void addTask(@RequestBody Task task) {
        log.info("Создана задача с id: {}", task);
        taskService.addTask(task);
    }

    @GetMapping("/tasks/{id}")
    public Task findById(@PathVariable long id) {
        return taskService.findById(id);
    }

    @GetMapping("/tasks")
    public List<Task> findByPipeline(@RequestParam("pipeline") String pipeline) {
        return taskService.findByPipeline(pipeline);
    }
}
