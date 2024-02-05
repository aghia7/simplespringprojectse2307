package kz.aitu.simplespringproject.controllers;

import kz.aitu.simplespringproject.models.User;
import kz.aitu.simplespringproject.services.interfaces.UserServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserServiceInterface service;

    public UserController(UserServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello SE-2307!";
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.create(user);
    }
}
