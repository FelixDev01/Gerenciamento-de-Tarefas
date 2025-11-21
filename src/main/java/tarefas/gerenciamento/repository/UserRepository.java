package tarefas.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tarefas.gerenciamento.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    ///Este optional é para procurar um usuario pelo username, utilizado para o login
    Optional<User> findByUsername(String username);

    ///Este Booleano é para verificar a existencia do usuario
    Boolean existByUsername(String username);
}
