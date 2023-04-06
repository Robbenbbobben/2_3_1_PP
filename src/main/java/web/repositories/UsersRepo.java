package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.User;

@Repository
public interface UsersRepo extends JpaRepository<User, Integer> {
}