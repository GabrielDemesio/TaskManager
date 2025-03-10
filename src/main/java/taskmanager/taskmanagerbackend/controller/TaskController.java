package taskmanager.taskmanagerbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;
import taskmanager.taskmanagerbackend.model.TaskModel;
import taskmanager.taskmanagerbackend.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskModel> getTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping
    public TaskModel createTask(@RequestBody TaskModel taskModel) {
        return taskService.saveTask(taskModel);
    }
    @DeleteMapping
    public void deleteTask(@PathVariable  Long id) {
        taskService.deleteTask(id);
    }

}
