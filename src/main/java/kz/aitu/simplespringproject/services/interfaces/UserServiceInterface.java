package kz.aitu.simplespringproject.services.interfaces;

import kz.aitu.simplespringproject.models.User;

import java.util.List;

public interface UserServiceInterface {
    User getById(int id);
    List<User> getAll();
    User create(User user);
}
