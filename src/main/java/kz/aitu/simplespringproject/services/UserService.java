package kz.aitu.simplespringproject.services;

import kz.aitu.simplespringproject.exceptions.UserNotFoundException;
import kz.aitu.simplespringproject.models.User;
import kz.aitu.simplespringproject.repositories.UserRepository;
import kz.aitu.simplespringproject.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }
}
