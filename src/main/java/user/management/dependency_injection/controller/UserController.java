package user.management.dependency_injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.management.dependency_injection.entity.User;
import user.management.dependency_injection.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;

  // Get all users
  @GetMapping("/field")
  public List<User> getAllUsersFieldInjected() {
    return userService.getAllUsersFieldInjected();
  }

  @GetMapping("/constructor")
  public List<User> getAllUsersConstructorInjected() {
    return userService.getAllUsersConstructorInjected();
  }

  @GetMapping("/setter")
  public List<User> getAllUsersSetterInjected() {
    return userService.getAllUsersSetterInjected();
  }

  // Find user by ID
  @GetMapping("/field/{id}")
  public Optional<User> getUserByIdFieldInjected(@PathVariable Long id) {
    return userService.getUserByIdFieldInjected(id);
  }

  @GetMapping("/constructor/{id}")
  public Optional<User> getUserByIdConstructorInjected(@PathVariable Long id) {
    return userService.getUserByIdConstructorInjected(id);
  }

  @GetMapping("/setter/{id}")
  public Optional<User> getUserByIdSetterInjected(@PathVariable Long id) {
    return userService.getUserByIdSetterInjected(id);
  }

  // Save user
  @PostMapping("/field")
  public void saveUserFieldInjected(@RequestBody User user) {
    userService.saveUserFieldInjected(user);
  }

  @PostMapping("/constructor")
  public void saveUserConstructorInjected(@RequestBody User user) {
    userService.saveUserConstructorInjected(user);
  }

  @PostMapping("/setter")
  public void saveUserSetterInjected(@RequestBody User user) {
    userService.saveUserSetterInjected(user);
  }
}
