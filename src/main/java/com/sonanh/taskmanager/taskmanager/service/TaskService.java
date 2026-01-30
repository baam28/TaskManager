package com.sonanh.taskmanager.taskmanager.service;

import com.sonanh.taskmanager.taskmanager.entity.Task;
import com.sonanh.taskmanager.taskmanager.enums.TaskStatus;
import com.sonanh.taskmanager.taskmanager.exception.ResourceNotFoundException;
import com.sonanh.taskmanager.taskmanager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task createTask(Task task) {
        task.setStatus(TaskStatus.TODO);
        return taskRepository.save(task);
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    // Chức năng 3: Cập nhật trạng thái (Logic nghiệp vụ)
    public Task updateTaskStatus(Long taskId, TaskStatus newStatus) {
        // Bước 1: Tìm xem task có tồn tại không
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + taskId));

        // Bước 2: Cập nhật trạng thái mới
        task.setStatus(newStatus);

        // Bước 3: Lưu xuống DB
        return taskRepository.save(task);
    }
}
