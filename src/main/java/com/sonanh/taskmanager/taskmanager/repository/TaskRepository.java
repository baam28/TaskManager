package com.sonanh.taskmanager.taskmanager.repository;

import com.sonanh.taskmanager.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
