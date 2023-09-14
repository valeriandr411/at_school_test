package org.example.dao;

import lombok.extern.slf4j.Slf4j;
import org.example.model.Task;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component("TaskDAO")
@Slf4j
public class TaskDAOImp implements TaskDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void create(Task task){
        entityManager.persist(task);
        log.info("Создана Задача");
    }

    @Override
    public List<Task> findByPipeline(String pipeline) {
        return entityManager.createQuery("select t from Task t where t.pipeline = :pipeline",Task.class)
                .setParameter("pipeline",pipeline)
                .getResultList();
    }
}
