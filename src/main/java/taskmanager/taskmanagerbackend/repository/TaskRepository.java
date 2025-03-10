package taskmanager.taskmanagerbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskmanager.taskmanagerbackend.model.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel,Long> {
}
