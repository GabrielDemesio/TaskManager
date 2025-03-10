package taskmanager.taskmanagerbackend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import taskmanager.taskmanagerbackend.model.TaskModel;
import taskmanager.taskmanagerbackend.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<TaskModel> getAllTasks() {
        return taskRepository.findAll();
    }
    public Optional<TaskModel> findById(Long id) {
        return taskRepository.findById(id);
    }
    public TaskModel saveTask(TaskModel taskModel) {
            return taskRepository.save(taskModel);
    }
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
