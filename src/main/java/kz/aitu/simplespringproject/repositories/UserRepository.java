package kz.aitu.simplespringproject.repositories;

import kz.aitu.simplespringproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
