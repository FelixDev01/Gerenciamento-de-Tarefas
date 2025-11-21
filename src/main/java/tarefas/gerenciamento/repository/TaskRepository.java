package tarefas.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tarefas.gerenciamento.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    ///Esta lista retornará apenas as tarefas do usuario que será mapeado pelo seu id
    List<Task> findByUserId(Long userId);
}
