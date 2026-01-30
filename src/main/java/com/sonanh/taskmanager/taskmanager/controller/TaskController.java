package com.sonanh.taskmanager.taskmanager.controller;

import com.sonanh.taskmanager.taskmanager.entity.Task;
import com.sonanh.taskmanager.taskmanager.enums.TaskStatus;
import com.sonanh.taskmanager.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 1. Báo hiệu đây là REST API
@RequestMapping("/api/tasks") // 2. Đường dẫn gốc: localhost:8080/api/tasks
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    // API tạo mới: POST /api/tasks
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // API lấy danh sách: GET /api/tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    // API Cập nhật trạng thái: PATCH /api/tasks/{id}/status
    @PatchMapping("/{id}/status")
    public Task updateStatus(@PathVariable Long id, @RequestParam TaskStatus status) {
        return taskService.updateTaskStatus(id, status);
    }
}