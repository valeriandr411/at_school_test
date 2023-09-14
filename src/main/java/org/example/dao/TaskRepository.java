package org.example.dao;

import org.example.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByPipeline(String pipeline);

    @Query(value = "select t from Task t where t.pipeline = ?1")
    List<Task> getByPipeline(String pipeline);
}
